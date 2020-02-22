import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { UserDetail } from '../classes/user-detail';
import { retry, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {


// Base url
baseurl = 'http://localhost:8081';

constructor(private http: HttpClient) { }

// Http Headers
httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}

// POST
CreateUser(data): Observable<UserDetail> {
  return this.http.post<UserDetail>(this.baseurl + '/3DePrint/createUser', JSON.stringify(data), this.httpOptions)
  .pipe(
    retry(1),
    catchError(this.errorHandl)
  )
}  

// GET
GetIssue(id): Observable<UserDetail> {
  return this.http.get<UserDetail>(this.baseurl + '/3DePrint/showUser/' + id)
  .pipe(
    retry(1),
    catchError(this.errorHandl)
  )
}

// GET
GetIssues(): Observable<UserDetail> {
  return this.http.get<UserDetail>(this.baseurl + '/3DePrint/showUser/')
  .pipe(
    retry(1),
    catchError(this.errorHandl)
  )
}

// PUT
UpdateBug(id, data): Observable<UserDetail> {
  return this.http.put<UserDetail>(this.baseurl + '/3DePrint/showUser/' + id, JSON.stringify(data), this.httpOptions)
  .pipe(
    retry(1),
    catchError(this.errorHandl)
  )
}

// DELETE
DeleteBug(id){
  return this.http.delete<UserDetail>(this.baseurl + '/3DePrint/showUser/' + id, this.httpOptions)
  .pipe(
    retry(1),
    catchError(this.errorHandl)
  )
}

// Error handling
errorHandl(error) {
   let errorMessage = '';
   if(error.error instanceof ErrorEvent) {
     // Get client-side error
     errorMessage = error.error.message;
   } else {
     // Get server-side error
     errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
   }
   console.log(errorMessage);
   return throwError(errorMessage);
}

}