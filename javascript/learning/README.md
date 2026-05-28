# JavaScript - Introduction & Basics

## What is JavaScript?

- Lightweight, interpreted, **object-oriented** programming language
- Used to make web pages **interactive** and **dynamic**
- Runs on the **client-side** (browser) and **server-side** (Node.js)
- First-class functions, prototype-based inheritance

## Setting Up JavaScript Development Environment

### Browser Console (Quick Testing)

```javascript
// Open DevTools (F12 / Ctrl+Shift+I) → Console tab
console.log("Hello, World!");
```

### Code Editor

- VS Code, WebStorm, Sublime Text
- Recommended extensions: ESLint, Prettier

### Node.js (Server-side JS)

```bash
node script.js
```

---

## JavaScript Syntax

### Statements

```javascript
let x = 5;
const y = 10;
```

- Each statement ends with a semicolon (`;`) — optional but recommended
- JavaScript ignores extra whitespace

### Comments

```javascript
// Single-line comment

/*
  Multi-line
  comment
*/
```

### Case Sensitivity

- `myVariable` and `myvariable` are **different**

### Identifiers

- Must start with a letter, `_`, or `$`
- Cannot start with a digit
- Convention: **camelCase** for variables/functions, **PascalCase** for classes

### Strict Mode

```javascript
"use strict";
// Catches common coding mistakes
```

---

## Variables

### `var` (old, function-scoped)

```javascript
var name = "John";
```

- Function-scoped, can be redeclared, hoisted

### `let` (ES6+, block-scoped, preferred)

```javascript
let age = 25;
age = 26;           // can reassign
// let age = 27;    // ERROR: cannot redeclare
```

### `const` (ES6+, block-scoped, cannot reassign)

```javascript
const pi = 3.14;
// pi = 3;          // ERROR: cannot reassign
// const x;         // ERROR: must initialize
```

---

## Data Types

### Primitive Types

| Type | Example | Description |
|---|---|---|
| `number` | `42`, `3.14`, `NaN` | Integers and floats |
| `string` | `"hello"`, `'world'`, `` `template` `` | Text |
| `boolean` | `true`, `false` | Logical values |
| `undefined` | `let x;` | Variable declared but no value |
| `null` | `let x = null;` | Intentional absence of value |
| `symbol` | `Symbol("id")` | Unique identifier (ES6) |
| `bigint` | `9007199254740991n` | Large integers (ES2020) |

### typeof Operator

```javascript
typeof 42           // "number"
typeof "hello"      // "string"
typeof true         // "boolean"
typeof undefined    // "undefined"
typeof null         // "object" (historical bug)
typeof Symbol()     // "symbol"
```

### Type Conversion

```javascript
// Implicit
"5" + 3     // "53" (string concatenation)
"5" - 3     // 2   (numeric subtraction)

// Explicit
Number("5")      // 5
String(123)      // "123"
Boolean(0)       // false
parseInt("5px")  // 5
parseFloat("3.14") // 3.14
```

---

## Operators

### Arithmetic

```javascript
+  -  *  /  %  **  (exponentiation)
++  --  (increment/decrement)
```

### Assignment

```javascript
=  +=  -=  *=  /=  %=  **=
```

### Comparison

```javascript
==    // loose equality (ignores type)
===   // strict equality (checks type)
!=    // loose inequality
!==   // strict inequality
>  <  >=  <=
```

- **Always prefer `===` over `==`**
- `==` performs type coercion: `5 == "5"` → `true`
- `===` requires same type: `5 === "5"` → `false`

### Logical

```javascript
&&   // AND
||   // OR
!    // NOT
```

- Short-circuit evaluation: `false && anything` → `false`
- `||` returns first truthy value or last falsy

### Ternary

```javascript
let result = condition ? valueIfTrue : valueIfFalse;
```

---

## Control Flow

### Conditional Statements

```javascript
// if-else if-else
if (score >= 90) {
  grade = "A";
} else if (score >= 80) {
  grade = "B";
} else {
  grade = "F";
}

// switch
switch (day) {
  case 0:
    console.log("Sunday");
    break;
  case 6:
    console.log("Saturday");
    break;
  default:
    console.log("Weekday");
}
```

### Loops

```javascript
// for loop
for (let i = 0; i < 5; i++) {
  console.log(i);
}

// while loop
let i = 0;
while (i < 5) {
  console.log(i);
  i++;
}

// do-while (executes at least once)
let j = 0;
do {
  console.log(j);
  j++;
} while (j < 5);

// for-of (arrays, strings, iterables)
for (let item of arr) { }

// for-in (object keys)
for (let key in obj) { }
```

### Break and Continue

```javascript
break;      // exit loop entirely
continue;   // skip to next iteration
```

### Error Handling

```javascript
try {
  // risky code
  throw new Error("Something went wrong");
} catch (error) {
  console.error(error.message);
} finally {
  // always executes
}
```

---

## Key Points

- Use `let` and `const` (not `var`) — block-scoped and safer
- `===` for comparison (avoid `==`)
- JavaScript is **dynamically typed** — variable type can change
- Always use `"use strict"` for cleaner code
- Strings are immutable; methods return new strings
- `NaN` is the only value not equal to itself (`NaN !== NaN` → `true`)
