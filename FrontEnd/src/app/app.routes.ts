import { Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { BookListComponent } from './book-list/book-list.component';
import { BookCreateComponent } from './book-create/book-create.component';

export const routes: Routes = [
    { path: '', component: MenuComponent},
    { path: 'list', component: BookListComponent},
    { path: 'create', component: BookCreateComponent}
];
