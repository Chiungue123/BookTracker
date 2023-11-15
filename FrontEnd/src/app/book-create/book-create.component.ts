import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MenuComponent } from '../menu/menu.component';

@Component({
  selector: 'app-book-create',
  standalone: true,
  imports: [CommonModule, MenuComponent],
  templateUrl: './book-create.component.html',
  styleUrl: './book-create.component.css'
})
export class BookCreateComponent {

  createBook(){
    console.log("Create Book")
  }
}
