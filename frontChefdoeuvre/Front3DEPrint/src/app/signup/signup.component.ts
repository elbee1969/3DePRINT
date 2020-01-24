import { Component, OnInit } from '@angular/core';
import { UserDetail } from '../classes/user-detail';
import { UserService } from '../services/user.service';
import { RouterModule } from '@angular/router';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  private userDetail = new UserDetail();

  constructor(private userService : UserService, private router : RouterModule) { }

  ngOnInit() {
  }
// form object creation
form = new FormGroup({
  email : new FormControl('', Validators.required),
  civility : new FormControl('', Validators.required),
  firstName : new FormControl('', Validators.required),
  lastName : new FormControl('', Validators.required),
  dateOfBirth : new FormControl('', Validators.required),
  password : new FormControl('', Validators.required),
  confirmPassword : new FormControl('', Validators.required),
  streetNumber : new FormControl(''),
  street : new FormControl(''),
  town : new FormControl(''),
  zipCode : new FormControl(''),
  country : new FormControl(''),  
  role: new FormControl('', Validators.required)
});

UserForm(UserInformation){
  let pwd = this.Password.value;
  let confirmPwd = this.ConfirmPassword.value;

  if(pwd == confirmPwd){
    this.userDetail.emailId = this.Email.value;
    this.userDetail.civility = this.Civility.value;
    this.userDetail.firstName = this.FirstName.value;
    this.userDetail.lastName = this.LastName.value;
    this.userDetail.dateOfBirth = this.DateOfBirth.value;
    this.userDetail.password = this.Password.value;
    this.userDetail.streetNumber = this.StreetNumber.value;
    this.userDetail.street = this.Street.value;
    this.userDetail.town = this.Town.value;
    this.userDetail.zipCode = this.ZipCode.value;
    this.userDetail.country = this.Country.value;
    this.userDetail.role = this.Role.value;
  }

}
get Email(){
  return this.form.get('email');
}
get Civility(){
  return this.form.get('civility');
}
get FirstName(){
  return this.form.get('firstName');
}
get LastName(){
  return this.form.get('lastName');
}
get DateOfBirth(){
  return this.form.get('dateOfBirth');
}
get Password(){
  return this.form.get('password');
}
get ConfirmPassword(){
  return this.form.get('confirmPassword');
}
get StreetNumber(){
  return this.form.get('streetnumber');
}
get Street(){
  return this.form.get('street');
}
get Town(){
  return this.form.get('town');
}
get ZipCode(){
  return this.form.get('zipCode');
}
get Country(){
  return this.form.get('country');
}
get Role(){
  return this.form.get('role');
}
get (){
  return this.form.get('');
}
}
