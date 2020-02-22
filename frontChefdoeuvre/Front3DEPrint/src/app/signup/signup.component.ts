import { Component, OnInit } from '@angular/core';
//import { UserDetail } from '../classes/user-detail';
import { UserService } from '../services/user.service';
import { RouterModule, Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
// import custom validator to validate that password and confirm password fields match
import { MustMatch } from '../helpers/must-match.validator';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})

export class SignupComponent implements OnInit {
  registerForm: FormGroup = new FormGroup({});
  submitted = false;
  admin = false;
  msgPwd1 = "Mot de passe requis";
  msgPwd2 = "Le mot de passe doit faire au moins 8 charactères";
  msgPwd3 = "Le mot de passe ne doit pas faire plus de 12 charactères";
  msgPwd4 = "le mot de passe doit contenir au minimum une lettre miniscule, une lettre majuscule, un nombre et un caractère spécial (@, !, %, *, ? ou &)";
  msgUsr1 = "Nom d'utilisateur requis";
  msgUsr2 = "Le mot de passe doit faire au moins 8 charactères";

  constructor(private userService: UserService, private router: Router, private formBuilder: FormBuilder, private http: HttpClient) { }

  passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&].{8,}";

  ngOnInit() {
    
    this.registerForm = this.formBuilder.group({
      userName: ['', Validators.required],
      gender: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      dateOfBirth: ['', Validators.required],
      streetNumber: ['', Validators.required],
      street: ['', Validators.required],
      town: ['', Validators.required],
      zipCode: ['', Validators.required],
      country: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(8), Validators.maxLength(12), Validators.pattern(this.passwordPattern)]],
      confirmPassword: ['', Validators.required],
      role: ['user'],
      acceptTerms: [false, Validators.requiredTrue]
    }, {
      validator: MustMatch('password', 'confirmPassword')
    },
    );
  }

  // convenience getter for easy access to form fields
  get f() { return this.registerForm.controls; }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.registerForm.invalid) {
      return;
    }
    this.userService.CreateUser(this.registerForm.value).subscribe(res => {
      console.log('Utilisateur ajouté !');
    })

    //this.http.post<object>('http://localhost:9000/3DePrint/createUser', this.registerForm.value, { headers: new HttpHeaders().set('Content-Type', 'application/json')}).subscribe();
    // display form values on success
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.registerForm.value, null, 4));
        this.router.navigate(['/login']);
  }

  onReset() {
    this.submitted = false;
    this.registerForm.reset();
  }

}
