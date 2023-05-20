# Project: API Documentation for Video_Hosting_Service
## Introduction

This API documentation provides information about the Bilibili API, which allows users to perform various actions related to objects and user management.

### API Version

Version: 1.0

### Base URL

Base URL: `localhost:15005`

### Authentication

To access protected endpoints, include the `token` header with a valid user token.

## End-point: Create a new object
- Method: `POST`
- URL: `/objects`
- Description: Create a new object.
### Method: POST
>```
>localhost:15005/objects
>```
### Body (**raw**)

```json
{
    "id":{{id}},
    "name":{{name}}
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get user token
- Method: `POST`
- URL: `/user-tokens`
- Description: Get user token.
### Method: POST
>```
>localhost:15005/user-tokens
>```
### Body (**raw**)

```json
{
    "phone":{{phone}},
    "password":{{password}}
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Create a new user
- Method: `POST`
- URL: `/users`
- Description: Create a new user.
### Method: POST
>```
>localhost:15005/users
>```
### Body (**raw**)

```json
{
    "phone":{{phone}},
    "password":{{password}}
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get users
- Method: `GET`
- URL: `/users`
- Description: Get users.
### Method: GET
>```
>localhost:15005/users
>```
### Headers

|Content-Type|Value|
|---|---|
|token|{{token}}|


### Body (**raw**)

```json
{
    "phone":{{phone}},
    "password":{{password}}
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get object with ID
- Method: `GET`
- URL: `/objects/4`
- Description: Get object with ID 4.
### Method: GET
>```
>localhost:15005/objects/4
>```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Update an object
- Method: `PUT`
- URL: `/objects`
- Description: Update an object.
### Method: PUT
>```
>localhost:15005/objects
>```
### Body (**raw**)

```json
{
    "id":4,
    "name":"name4"
}
```


