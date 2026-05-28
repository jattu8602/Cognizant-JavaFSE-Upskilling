# JavaScript - Objects and the DOM

## Objects in JavaScript

Objects are collections of **key-value pairs** (properties).

### Creating Objects

```javascript
// Object literal
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 30,
  greet() {           // method shorthand
    console.log("Hello!");
  }
};

// Using 'new Object()'
const car = new Object();
car.make = "Toyota";

// Using constructor function
function Person(name, age) {
  this.name = name;
  this.age = age;
}
const p = new Person("Alice", 25);

// Class syntax (ES6)
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(`${this.name} makes a sound`);
  }
}
```

### Accessing Properties

```javascript
// Dot notation
person.firstName;   // "John"

// Bracket notation (for dynamic keys/invalid identifiers)
person["first name"];  // when key has spaces
let key = "age";
person[key];           // 30 (dynamic)

// Optional chaining (ES2020) — safe access
console.log(person?.address?.city); // undefined (no error)
```

### Adding/Modifying Properties

```javascript
person.email = "john@example.com";
person.age = 31;
```

### Deleting Properties

```javascript
delete person.age;
```

### Checking Properties

```javascript
"age" in person;         // true
person.hasOwnProperty("age"); // true (own, not inherited)
```

### Object Methods

```javascript
Object.keys(person);      // ["firstName", "lastName", "age"]
Object.values(person);    // ["John", "Doe", 30]
Object.entries(person);   // [["firstName","John"], ...]
Object.assign(target, source); // copy properties

// Freeze (immutable)
Object.freeze(obj);       // cannot add/delete/change
Object.seal(obj);         // can change, cannot add/delete
```

---

## Prototypes

JavaScript uses **prototype-based inheritance** (not classical).

```javascript
function Person(name) {
  this.name = name;
}

// Add method to prototype (shared across all instances)
Person.prototype.greet = function() {
  console.log("Hi, I'm " + this.name);
};

const p1 = new Person("Alice");
const p2 = new Person("Bob");
p1.greet(); // Hi, I'm Alice
p2.greet(); // Hi, I'm Bob

// Check prototype
Person.prototype.isPrototypeOf(p1); // true
p1.__proto__ === Person.prototype;   // true (modern: Object.getPrototypeOf())

// Prototype chain
// p1 → Person.prototype → Object.prototype → null
```

### Prototype Chain

```javascript
function Student(name, grade) {
  Person.call(this, name);  // call parent constructor
  this.grade = grade;
}

// Inherit from Person
Student.prototype = Object.create(Person.prototype);
Student.prototype.constructor = Student;

Student.prototype.study = function() {
  console.log(this.name + " studies");
};
```

### Class Syntax (Syntactic Sugar over Prototypes)

```javascript
class Person {
  constructor(name) {
    this.name = name;
  }
  greet() {
    console.log("Hi, I'm " + this.name);
  }
}

class Student extends Person {
  constructor(name, grade) {
    super(name);  // call parent constructor
    this.grade = grade;
  }
  study() {
    console.log(this.name + " studies");
  }
  greet() {  // override
    super.greet();
    console.log("and I'm a student");
  }
}
```

---

## The Document Object Model (DOM)

The DOM is a tree representation of the HTML document. JavaScript can **access and modify** the DOM.

### Selecting Elements

```javascript
// Single element
document.getElementById("header");
document.querySelector(".my-class");   // first match (CSS selector)

// Multiple elements
document.getElementsByClassName("item");   // HTMLCollection (live)
document.getElementsByTagName("p");         // HTMLCollection (live)
document.querySelectorAll(".item");         // NodeList (static)
```

### Traversing the DOM

```javascript
const el = document.getElementById("main");

el.parentNode;          // parent element
el.children;            // HTMLCollection of children
el.firstElementChild;   // first child element
el.lastElementChild;    // last child element
el.nextElementSibling;  // next sibling element
el.previousElementSibling; // previous sibling element
el.closest(".wrapper"); // nearest ancestor matching selector
```

### Manipulating Content

```javascript
el.innerHTML = "<strong>New content</strong>";     // HTML (parsed)
el.textContent = "Plain text";                       // text only (safe)
el.innerText = "Visible text";                       // respects CSS display

// Attributes
el.getAttribute("href");
el.setAttribute("class", "active");
el.hasAttribute("disabled");
el.removeAttribute("disabled");

// Classes
el.classList.add("active");
el.classList.remove("hidden");
el.classList.toggle("visible");
el.classList.contains("active"); // true/false
```

### Creating and Removing Elements

```javascript
// Create
const div = document.createElement("div");
div.textContent = "Hello";
document.body.appendChild(div);

// Insert
parent.insertBefore(newEl, referenceEl);     // before reference
parent.append(newEl);                        // at end
parent.prepend(newEl);                       // at beginning
el.after(newEl);                             // after element
el.before(newEl);                            // before element

// Remove
el.remove();              // modern (no browser support issues)
parent.removeChild(el);   // older approach

// Clone
const clone = el.cloneNode(true);  // true = deep clone
```

### Styling

```javascript
// Inline styles
el.style.color = "red";
el.style.backgroundColor = "blue";    // camelCase
el.style.cssText = "color: red; font-size: 16px;";

// Computed styles
getComputedStyle(el).color;

// Dimensions
el.offsetWidth;      // width + padding + border
el.clientWidth;      // width + padding
el.scrollHeight;     // total scrollable height
el.getBoundingClientRect(); // position relative to viewport
```

---

## Event Handling

### Adding Event Listeners

```javascript
// Modern approach
element.addEventListener("click", function(event) {
  console.log("Clicked!");
});

// Inline (avoid — mixes markup with behavior)
// <button onclick="handleClick()">Click</button>

// DOM property (only one handler)
element.onclick = function() { };
```

### Common Events

```javascript
// Mouse
click, dblclick, mouseover, mouseout, mousedown, mouseup, mousemove

// Keyboard
keydown, keyup, keypress

// Form
submit, change, input, focus, blur, reset

// Document/Window
DOMContentLoaded, load, scroll, resize, unload
```

### Event Object

```javascript
element.addEventListener("click", (event) => {
  event.target;        // element that triggered event
  event.currentTarget; // element listener is attached to
  event.type;          // "click"
  event.preventDefault();  // prevent default (e.g., link navigation)
  event.stopPropagation(); // stop bubbling
});
```

### Event Bubbling and Capturing

```html
<div id="parent">
  <button id="child">Click</button>
</div>
```

```javascript
// Bubbling (default): child → parent → document
// Capturing: document → parent → child

// Capture phase
parent.addEventListener("click", handler, true);   // capture: true

// Bubbling phase (default)
parent.addEventListener("click", handler);          // capture: false (default)

// Stop propagation
event.stopPropagation();     // stop bubbling/capturing
event.stopImmediatePropagation(); // stop all listeners on same element
```

### Event Delegation

Attach a single listener to a parent to handle events on dynamic children:

```javascript
document.querySelector("ul").addEventListener("click", (event) => {
  if (event.target.tagName === "LI") {
    console.log("Clicked:", event.target.textContent);
  }
});
```

---

## `this` Keyword

```javascript
// Global context → window (or undefined in strict mode)
console.log(this); // window

// Object method → the object
const obj = { name: "Obj", show() { console.log(this.name); } };
obj.show(); // "Obj"

// Constructor → new instance
function Person(name) { this.name = name; }

// Event handler → element
button.addEventListener("click", function() { console.log(this.id); });

// Arrow function → lexical scope (no own this)
const obj2 = {
  name: "Obj",
  show: () => console.log(this.name)  // 'this' is outer scope, NOT obj2
};

// Explicit binding
func.call(context, arg1, arg2);
func.apply(context, [arg1, arg2]);
const bound = func.bind(context);
```

---

## Key Points

- Objects use **prototype-based inheritance**, not classes
- `class` syntax is cleaner but still uses prototypes underneath
- DOM is a **tree** — traverse with `parentNode`, `children`, `querySelector`
- Use `addEventListener` over inline event handlers
- **Event delegation** improves performance for dynamic elements
- Arrow functions **do not** have their own `this`
