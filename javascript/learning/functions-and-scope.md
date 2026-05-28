# JavaScript - Functions and Scope

## Function Basics

### Function Declaration

```javascript
function greet(name) {
  return "Hello, " + name + "!";
}
```

- Hoisted — can be called before definition
- Has its own `this` binding

### Function Expression

```javascript
const greet = function(name) {
  return "Hello, " + name + "!";
};
```

- NOT hoisted
- Can be anonymous or named

### Arrow Functions (ES6)

```javascript
const greet = (name) => "Hello, " + name + "!";

// Multi-line
const sum = (a, b) => {
  let result = a + b;
  return result;
};

// Single parameter (parentheses optional)
const square = x => x * x;

// No parameters
const hello = () => "Hello!";
```

- No `this` binding (inherits from surrounding scope)
- No `arguments` object
- Cannot be used as constructor
- Implicit return for single-expression body (no `{}`)

### Parameters

```javascript
// Default parameters (ES6)
function greet(name = "Guest") {
  return "Hello, " + name;
}

// Rest parameters (ES6)
function sum(...numbers) {
  return numbers.reduce((a, b) => a + b, 0);
}

// Arguments object (old way, arrow functions don't have this)
function oldSum() {
  return Array.from(arguments).reduce((a, b) => a + b);
}
```

### Return Values

- Functions return `undefined` by default
- `return` immediately exits the function

---

## Scope

Scope determines **where** variables are accessible.

### Global Scope

```javascript
let globalVar = "I'm global";

function test() {
  console.log(globalVar); // accessible
}
```

### Function Scope

```javascript
function test() {
  var localVar = "I'm local";
}
console.log(localVar); // ReferenceError
```

- `var` is **function-scoped**

### Block Scope (ES6)

```javascript
{
  let blockVar = "I'm block-scoped";
  const alsoBlock = "Me too";
  var notBlock = "I'm function-scoped"; // NOT block-scoped
}
console.log(notBlock);   // accessible
console.log(blockVar);   // ReferenceError
```

- `let` and `const` are **block-scoped**
- `var` ignores block scope

### Lexical (Static) Scope

Inner functions can access variables of outer functions:

```javascript
function outer() {
  let x = 10;

  function inner() {
    console.log(x); // 10 (accesses outer variable)
  }

  inner();
}
```

---

## Closures

A closure is a function that **remembers** its lexical scope even when the function executes **outside** that scope.

```javascript
function createCounter() {
  let count = 0;

  return function() {
    count++;
    return count;
  };
}

const counter = createCounter();
console.log(counter()); // 1
console.log(counter()); // 2
console.log(counter()); // 3
```

### Practical Closure Uses

```javascript
// Private variables
function createPerson(name) {
  let _age = 0;  // private
  return {
    getName: () => name,
    getAge: () => _age,
    setAge: (age) => { _age = age; }
  };
}

// Function factories
function multiplyBy(factor) {
  return (num) => num * factor;
}
const double = multiplyBy(2);
console.log(double(5)); // 10
```

### Closure vs Scope

| Scope | Closure |
|---|---|
| Where variables are defined | Function that retains access to its outer scope |
| Determined at compile time | Created when a function "remembers" its environment |
| Stored in scope chain | The closed-over variables persist in memory |

---

## Higher-Order Functions

A function that **takes a function as argument** or **returns a function**.

### Functions as Arguments

```javascript
function operate(a, b, operation) {
  return operation(a, b);
}

const result = operate(5, 3, (x, y) => x + y); // 8
```

### Functions Returning Functions

```javascript
function createLogger(prefix) {
  return (message) => console.log(`[${prefix}] ${message}`);
}

const infoLog = createLogger("INFO");
infoLog("Server started"); // [INFO] Server started
```

### Built-in Higher-Order Functions

```javascript
// setTimeout / setInterval
setTimeout(() => console.log("Delayed"), 1000);

// Array methods
const numbers = [1, 2, 3, 4, 5];
const doubled = numbers.map(n => n * 2);
const evens = numbers.filter(n => n % 2 === 0);
const sum = numbers.reduce((total, n) => total + n, 0);
const found = numbers.find(n => n > 3);
const hasEven = numbers.some(n => n % 2 === 0);
const allPositive = numbers.every(n => n > 0);
```

---

## Immediately Invoked Function Expressions (IIFE)

```javascript
(function() {
  let privateVar = "secret";
  console.log("Runs immediately");
})();

// With ES6 modules, IIFE is less needed
```

- Creates a private scope
- Runs immediately after definition
- Avoids polluting global namespace

---

## Recursion

```javascript
function factorial(n) {
  if (n <= 1) return 1;
  return n * factorial(n - 1);
}
```

---

## Key Points

- **Arrow functions** have no `this` — use for callbacks
- **Closures** enable data privacy and function factories
- **Higher-order functions** enable functional programming patterns
- Use `let`/`const` for block-scoped variables
- Avoid `var` — confusing scoping rules
