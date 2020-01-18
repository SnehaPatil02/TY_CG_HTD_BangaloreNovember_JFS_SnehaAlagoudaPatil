import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AddPostsComponent } from './add-posts/add-posts.component';
import { GetAllPostsComponent } from './get-all-posts/get-all-posts.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'add-posts', component: AddPostsComponent},
  {path: 'get-all-posts', component: GetAllPostsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
