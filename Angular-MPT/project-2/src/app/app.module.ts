import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AddPostsComponent } from './add-posts/add-posts.component';
import { HeaderComponent } from './header/header.component';
import { GetAllPostsComponent } from './get-all-posts/get-all-posts.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddPostsComponent,
    HeaderComponent,
    GetAllPostsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
