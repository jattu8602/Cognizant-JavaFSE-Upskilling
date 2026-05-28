# JavaScript - ES6+ Features and Web Development

## ES6+ Features

### Let and Const

```javascript
let x = 10;           // block-scoped, can reassign
const y = 20;         // block-scoped, cannot reassign
```

(See `README.md` for details)

### Template Literals

```javascript
const name = "World";
const greeting = `Hello, ${name}!`;   // "Hello, World!"

// Multi-line strings
const html = `
  <div>
    <h1>Title</h1>
  </div>
`;

// Tagged templates (advanced)
function highlight(strings, ...values) {
  return strings.reduce((result, str, i) =>
    result + str + (values[i] ? `<strong>${values[i]}</strong>` : ""), "");
}
const result = highlight`Hello ${name}, you are ${age} years old.`;
```

### Destructuring

```javascript
// Array destructuring
const [a, b, ...rest] = [1, 2, 3, 4, 5];
// a=1, b=2, rest=[3,4,5]

// Swapping variables
[a, b] = [b, a];

// Object destructuring
const person = { name: "Alice", age: 25, city: "NYC" };
const { name, age, country = "USA" } = person;
// name="Alice", age=25, country="USA"

// Renaming
const { name: fullName, age: years } = person;

// Nested destructuring
const data = { user: { id: 1, address: { city: "NYC" } } };
const { user: { address: { city } } } = data;

// Function parameter destructuring
function greet({ name, age }) {
  console.log(`${name} is ${age} years old`);
}
greet(person);
```

### Spread and Rest Operators (`...`)

```javascript
// Spread (expand iterable into elements)
const arr1 = [1, 2, 3];
const arr2 = [...arr1, 4, 5];       // [1, 2, 3, 4, 5]
const copy = [...arr1];              // shallow copy

const obj1 = { a: 1, b: 2 };
const obj2 = { ...obj1, c: 3 };     // { a: 1, b: 2, c: 3 }

// Spread in function call
Math.max(...[1, 5, 3]);             // 5

// Rest (collect remaining into array)
function sum(...nums) {
  return nums.reduce((a, b) => a + b, 0);
}
sum(1, 2, 3, 4);  // 10

const [first, ...rest] = [1, 2, 3, 4];
```

### Default Parameters

```javascript
function greet(name = "Guest", greeting = "Hello") {
  return `${greeting}, ${name}!`;
}
greet();              // "Hello, Guest!"
greet("Alice");       // "Hello, Alice!"
```

### Enhanced Object Literals

```javascript
const name = "Alice", age = 25;

const person = {
  name,               // shorthand: name: name
  age,                // shorthand: age: age
  greet() {           // method shorthand
    console.log(`Hi, I'm ${this.name}`);
  },
  ["prop_" + age]: "dynamic"  // computed property keys
};
```

### Modules (ES6)

```javascript
// --- math.js (export) ---
export const PI = 3.14;
export function add(a, b) { return a + b; }
export default class Calculator { /* ... */ }

// --- app.js (import) ---
import Calculator, { PI, add } from "./math.js";
import * as MathUtils from "./math.js";
```

- Modules are **strict mode** by default
- Use `type="module"` in HTML: `<script type="module" src="app.js">`
- `export default` — one per module
- Named exports — multiple per module

### Other Notable ES6+ Features

```javascript
// Symbol (unique identifiers)
const sym = Symbol("description");
const obj = { [sym]: "secret" };

// Map (key-value with any key type)
const map = new Map();
map.set("key", "value");
map.get("key");

// Set (unique values)
const set = new Set([1, 2, 2, 3]); // {1, 2, 3}

// Array.from / Array.of
Array.from("hello");       // ["h","e","l","l","o"]
Array.of(1, 2, 3);         // [1, 2, 3]

// Object.assign (copy properties)
Object.assign(target, source);
```

---

## Working with Forms

### Accessing Form Elements

```html
<form id="myForm">
  <input type="text" name="username" id="username">
  <input type="email" name="email">
  <select name="country">
    <option value="us">USA</option>
    <option value="uk">UK</option>
  </select>
  <button type="submit">Submit</button>
</form>
```

```javascript
const form = document.getElementById("myForm");

// Access form elements
const username = form.elements.username;
const email = form.elements["email"];

// Get values
username.value;
email.value;

// Checkboxes / Radio buttons
form.elements.hobby.checked;
form.elements.gender.value;
```

### Form Events

```javascript
form.addEventListener("submit", (event) => {
  event.preventDefault();  // prevent page reload

  const data = new FormData(form);
  for (let [key, value] of data) {
    console.log(key, value);
  }
});

// Real-time validation
username.addEventListener("input", (event) => {
  if (event.target.value.length < 3) {
    event.target.classList.add("error");
  } else {
    event.target.classList.remove("error");
  }
});
```

### Form Validation (HTML5 + JS)

```html
<input type="text" required minlength="3" pattern="[A-Za-z]+">
```

```javascript
// Constraint Validation API
const input = document.getElementById("username");

if (input.validity.valid) {
  // field is valid
} else {
  if (input.validity.valueMissing) { /* required field empty */ }
  if (input.validity.tooShort) { /* too short */ }
  if (input.validity.patternMismatch) { /* pattern mismatch */ }
}

// Custom validity
input.setCustomValidity("Please enter a valid username");
input.reportValidity();  // show message
```

---

## AJAX and Fetch API

### XMLHttpRequest (Old way)

```javascript
const xhr = new XMLHttpRequest();
xhr.open("GET", "https://api.example.com/data");
xhr.onload = function() {
  if (xhr.status === 200) {
    console.log(JSON.parse(xhr.responseText));
  }
};
xhr.onerror = function() {
  console.error("Request failed");
};
xhr.send();
```

### Fetch API (Modern, Promise-based)

```javascript
// GET request
fetch("https://api.example.com/users")
  .then(response => {
    if (!response.ok) {
      throw new Error(`HTTP ${response.status}`);
    }
    return response.json();  // or .text() for plain text
  })
  .then(data => console.log(data))
  .catch(error => console.error(error));

// POST request
fetch("https://api.example.com/users", {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify({ name: "Alice", age: 25 })
})
  .then(res => res.json())
  .then(data => console.log(data));
```

### Fetch with Async/Await

```javascript
async function getUsers() {
  try {
    const response = await fetch("https://api.example.com/users");
    if (!response.ok) throw new Error("Failed");
    return await response.json();
  } catch (error) {
    console.error(error);
    return [];
  }
}
```

### Response Methods

```javascript
response.json();        // parse as JSON
response.text();        // parse as plain text
response.blob();        // for binary data / images
response.formData();    // for FormData
response.arrayBuffer(); // for raw binary
```

### Common HTTP Status Codes

| Code | Meaning |
|---|---|
| 200 | OK |
| 201 | Created |
| 400 | Bad Request |
| 401 | Unauthorized |
| 404 | Not Found |
| 500 | Internal Server Error |

### CORS (Cross-Origin Resource Sharing)

- Browsers block cross-origin requests by default
- Server must include `Access-Control-Allow-Origin` header
- For development, use proxy or CORS extension

---

## Key Points

- **Template literals** (`backticks`) make string interpolation clean
- **Destructuring** extracts values from arrays/objects elegantly
- **Spread operator** (`...`) clones arrays/objects
- **Modules** (`import`/`export`) organize code
- **FormData API** simplifies form handling
- **Fetch API** is the modern replacement for XMLHttpRequest
- Always handle errors with `try/catch` or `.catch()`
- Check `response.ok` before parsing
