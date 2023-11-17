import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-book-create',
  standalone: true,
  imports: [CommonModule, HttpClientModule],
  templateUrl: './book-create.component.html',
  styleUrl: './book-create.component.css'
})
export class BookCreateComponent {

  createBook(){
    console.log("Create Book")
  }
}
