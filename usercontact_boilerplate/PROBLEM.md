# Contact List app

## Problem Statement

Contact list app is keep track of all the contacts. We can add a person with his deatils like name and mobile number to contacts list. We can search for any contact by name or mobile number

## Know your APIs
    
     - POST    - http://localhost:3000/contacts      - add a new contact
     - GET     - http://localhost:3000/contacts      - get all existing contacts 

## TECH STACK

- Angular12
- Jasmine
- json-server

## PREREQUISITES

  1. Install dependencies `npm install or yarn install`
  2. Run the frontend `npm run start` which shall run on port:4200  
  3. Use `json-server --watch db.json` for APIs availabilty using json-server

## Problem
- Create a Reactive form in contact component that allows us to provide name and phone number and make a POST request
- Define search component that lists all contact available when a GET request is made, And also should filter conatcts basis search criteria.
- Define a search pipe that searches from contact list basis name or phone number.
- Define a user service class to make POST and GET request to json server.
## Instructions

1. Your are expected to write code in the given boilerplate so that you can complete this assignment
2. All the detailed instructions are given inside the project
3. Understand the comments in the project and write code
4. After writing the code unit test your code by running `npm run test` or `ng test` and check for any lint erros using `npm run lint` or `ng lint`
