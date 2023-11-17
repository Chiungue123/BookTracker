import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Book } from '../models/book';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-book-list',
  standalone: true,
  imports: [CommonModule, HttpClientModule],
  templateUrl: './book-list.component.html',
  styleUrl: './book-list.component.css'
})

export class BookListComponent {
  books: Book[] = [];

  constructor(private http: HttpClient) { }

  getBooks(): Observable<Book[]> {
    console.log("Data Service: Get Books")
    return this.http.get<Book[]>('http://localhost:8080/test')
  }

  ngOnInit() {
    console.log("BookListComponent ngOnInit");
    this.getBooks().subscribe(books => {
      this.books = books;
    });
  }
  
  /*constructor(private service: DataService){
    console.log("BookListComponent Constructor");
  }

  ngOnInit(){
    console.log("BookListComponent ngOnInit");
    this.service.getBooks().subscribe(books => {
      this.books = books;
    });
  }*/
}