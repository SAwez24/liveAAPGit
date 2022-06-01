0. MAIN.TS

platformBrowserDynamic().bootstrapModule(AppModule)

1. CREATE THE CLASS

class AppModule {
}

2. EXPORT IT
export class AppModule {
}

3. MAKE IT A MODULE with @NgModule decorator
@NgModule( {
	
}) 


4. CONFIGURE THE DECORATOR
@NgModule( {
	declarations : [AppComponent,AddEmpComponent],
	import : [BrowserModule],
	provider : [],
	bootstrap: [AppComponent]	
}) 
export class AppModule {
}

5. ADD THE NECESSARY IMPORTS
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component.ts'


6. EXPLORE THE APPCOMPONENT
ng generate component app
ng g c app
app.component.ts
app.component.html
app.componrnt.css
app.component.spec.ts

7. CODE THE APP COMPONENT

@Component( {
selector:'app-root' ,
templateUrl :'./app.component.html' ,
styleUrls:'./app.component.css,
})
export class AppComponent {
	title = "AppName"
	onSubmit() : void {
		console.log('submitted');
	}
}

8. CODE THE TEMPLATE
string interpolation
<H1>{{title}}</H1>

9. STYLE UP
h1 {
	color : 'red'
}

