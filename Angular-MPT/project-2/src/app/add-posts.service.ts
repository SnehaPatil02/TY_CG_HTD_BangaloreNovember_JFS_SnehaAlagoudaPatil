import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddPostsService {
  url = 'http://localhost:8080/';
  constructor(private http: HttpClient) { }

  addPost(posts): Observable<any> {
    return this.http.post<any>(`${this.url}/addposts`, posts);
  }


}
