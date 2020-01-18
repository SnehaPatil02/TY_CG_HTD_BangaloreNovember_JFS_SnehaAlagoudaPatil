import { Component, OnInit } from '@angular/core';
import { AddPostsService } from '../add-posts.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-posts',
  templateUrl: './add-posts.component.html',
  styleUrls: ['./add-posts.component.css']
})
export class AddPostsComponent implements OnInit {
  success: string;
  failure: string;
  constructor(private add: AddPostsService) { }

ngOnInit() { }
addPost(form: NgForm) {
    this.add.addPost(form.value).subscribe(data => {
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
