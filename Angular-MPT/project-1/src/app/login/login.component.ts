import { Component, OnInit } from '@angular/core';
import { AuthenicationService } from '../authentication.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private auth: AuthenicationService) { }
  success: string;


  ngOnInit() {
  }


  login(form: NgForm) {
    this.auth.login(form.value).subscribe(data => {
      console.log(data);


      if (data.statusCode === 201) {
        this.success = data.discription;
        setTimeout(() => {
          this.success = null;
        }, 2000);
      }
    });
  }
}



