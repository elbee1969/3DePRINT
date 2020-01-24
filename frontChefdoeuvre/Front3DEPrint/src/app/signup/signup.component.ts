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
})

}
