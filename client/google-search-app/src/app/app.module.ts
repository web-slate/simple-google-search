import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './common/header/header.component';
import {FooterComponent} from './common/footer/footer.component';
import {HomePageComponent} from './home-page/home-page.component';
import {SearchPageComponent} from './search-page/search-page.component';
import {SearchFormComponent} from "./common/search-form/search-form.component";
import {LogoComponent} from './common/logo/logo.component';
import {SearchButtonComponent} from "./common/search-button/search-button.component";
import {FormsModule} from "@angular/forms";
import { SearchResultsComponent } from './search-page/search-results.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomePageComponent,
    SearchPageComponent,
    LogoComponent,
    SearchButtonComponent,
    SearchFormComponent,
    LogoComponent,
    SearchResultsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
