import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

import { CrudOperations } from './crud-operations.interface';
import { Page } from "../entity/page";
import { Query } from "../entity/query";
import { config } from "../config";

const httpOptions = {

    headers: new HttpHeaders({

        'Content-Type': 'application/json',

        'cache-control': 'no-cache',

        'x-csrf-token': config.authToken

    })

};

export abstract class CrudService<T, ID> implements CrudOperations<T, ID> {

    constructor(

        protected _http: HttpClient,

        protected _url: string

    ) {}

    delete(id: ID): Observable<ID> {

        return this._http.delete<ID>(this._url + '/' + id, httpOptions);
    }

    get(id: ID): Observable<T> {

        return this._http.get<T>(this._url + '/' + id, httpOptions);
    }

    getPage(): Observable<Page<T>> {
        return this._http.get<Page<T>>(this._url, httpOptions);

    }

    patch(id: ID, entity: T): Observable<T> {

        return this._http.patch<T>(this._url + '/' + id, entity, httpOptions);
    }

    post(entity: T): Observable<T> {

        return this._http.post<T>(this._url, entity, httpOptions);

    }

    query(query: Query): Observable<Page<T>> {

        const opts = {

           ...httpOptions,

            params: new HttpParams(
                {fromString: `search=${query.searchTerm}`}
            )

        };

        return this._http.get<Page<T>>(this._url, opts);

    }

    update(id: ID, entity: T): Observable<T> {

        return this._http.put<T>(this._url + '/' + id, entity, httpOptions);

    }

}
