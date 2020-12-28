import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppGoogleHeaderComponent } from './app-google-header/app-google-header.component';
import { AppGoogleFooterComponent } from './app-google-footer/app-google-footer.component';

@NgModule({
  declarations: [
    AppComponent,
    AppGoogleHeaderComponent,
    AppGoogleFooterComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
