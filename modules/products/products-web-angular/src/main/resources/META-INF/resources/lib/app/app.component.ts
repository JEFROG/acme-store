import { Component, OnInit } from '@angular/core';
import {
	Event,
	NavigationCancel,
	NavigationEnd,
	NavigationError,
	NavigationStart,
	Router
} from '@angular/router';

declare const Liferay: any;

@Component({
	template: `
		
		<span *ngIf="loading" aria-hidden="true" class="loading-animation loading-animation"></span>
		
		<router-outlet></router-outlet>
		
	`,
})
export class AppComponent implements OnInit {

	loading = false;

	constructor(private router: Router) {
		this.router.events.subscribe((event: Event) => {
			switch (true) {
				case event instanceof NavigationStart: {
					this.loading = true;
					break;
				}

				case event instanceof NavigationEnd:
				case event instanceof NavigationCancel:
				case event instanceof NavigationError: {
					this.loading = false;
					break;
				}
				default: {
					break;
				}
			}
		});
	}

	ngOnInit(): void {

		if(Liferay.ThemeDisplay.isSignedIn()) {

			// route to the main page

			this.router.navigate(['/products']);

		}

	}

}