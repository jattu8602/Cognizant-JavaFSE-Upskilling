# JavaScript - Debugging, Testing, and Frameworks

## JavaScript Debugging Tools

### console Methods

```javascript
console.log("Simple log");
console.error("Error message");
console.warn("Warning");
console.info("Info");

console.table([{name: "Alice", age: 25}, {name: "Bob", age: 30}]);
console.group("User Details");
console.log("Name: Alice");
console.log("Age: 25");
console.groupEnd();

console.time("Loop");
for (let i = 0; i < 1000000; i++) { /* ... */ }
console.timeEnd("Loop");  // shows elapsed time

console.trace();   // shows call stack
console.count();   // count occurrences
```

### Browser DevTools

- **Console** — log messages, run JS interactively
- **Sources** — set breakpoints, step through code
- **Debugger** panel — watch variables, call stack, scope

### Debugger Statement

```javascript
function calculateTotal(items) {
  debugger;  // execution pauses here (if DevTools open)
  return items.reduce((sum, item) => sum + item.price, 0);
}
```

### Breakpoints in DevTools

1. **Line breakpoints** — click line number in Sources tab
2. **Conditional breakpoints** — right-click line → edit condition
3. **DOM breakpoints** — right-click element → Break on → subtree modifications
4. **Event listener breakpoints** — Sources → Event Listener Breakpoints
5. **XHR/fetch breakpoints** — break when URL contains pattern

### Watch Expressions

Add expressions in DevTools to monitor variable values as you step through code.

---

## Testing JavaScript Code

### Types of Testing

| Type | Purpose |
|---|---|
| Unit Testing | Test individual functions/modules |
| Integration Testing | Test how modules work together |
| End-to-End (E2E) | Test complete user flows |
| Visual Regression | Test visual appearance |

### Jest (Popular Testing Framework)

```javascript
// calculator.js
function add(a, b) { return a + b; }
module.exports = { add };

// calculator.test.js
const { add } = require("./calculator");

test("adds 1 + 2 to equal 3", () => {
  expect(add(1, 2)).toBe(3);
});

test("adds negative numbers", () => {
  expect(add(-1, -1)).toBe(-2);
});

// Setup and teardown
beforeEach(() => {
  // runs before each test
});

afterAll(() => {
  // runs after all tests
});
```

### Common Jest Matchers

```javascript
expect(value).toBe(42);               // strict equality (===)
expect(value).toEqual({a: 1});        // deep equality
expect(value).toBeNull();
expect(value).toBeUndefined();
expect(value).toBeDefined();
expect(value).toBeTruthy();
expect(value).toBeFalsy();
expect(value).toBeGreaterThan(3);
expect(value).toContain("hello");
expect(value).toHaveLength(5);
expect(func).toThrow();
expect(func).toThrow(Error);
```

### Testing Async Code

```javascript
// Promise
test("fetches data", () => {
  return fetchData().then(data => {
    expect(data).toBeDefined();
  });
});

// Async/await
test("fetches data", async () => {
  const data = await fetchData();
  expect(data).toBeDefined();
});

// Callback
test("fetches data", done => {
  fetchData((data) => {
    expect(data).toBeDefined();
    done();
  });
});
```

### Mocha + Chai (Alternative)

```javascript
const { expect } = require("chai");

describe("Calculator", () => {
  it("should add two numbers", () => {
    expect(add(1, 2)).to.equal(3);
  });
});
```

### Visual Studio Testing (Microsoft)

- VS has built-in test explorer for JavaScript
- Supports Jest, Mocha, and other frameworks
- Run tests with GUI, debug tests with breakpoints

---

## Introduction to JavaScript Frameworks

### What are JavaScript Frameworks?

- Pre-written JS code that provides structure and tools
- Helps build complex applications faster
- Manages state, routing, rendering, and more

### Popular JavaScript Frameworks

| Framework | Type | Best For |
|---|---|---|
| **React** | Library (UI) | Component-based SPAs, large apps |
| **Vue.js** | Framework (Progressive) | Small to large apps, gentle learning curve |
| **Angular** | Full Framework | Enterprise apps, TypeScript-native |
| **Svelte** | Compiler | Lightweight apps, minimal bundle size |
| **Next.js** | React Meta-framework | SSR, SSG, full-stack React apps |
| **Nuxt.js** | Vue Meta-framework | SSR, SSG with Vue |
| **Express.js** | Backend Framework | Node.js REST APIs, server-side apps |

### When to Use a Framework

- Building complex user interfaces with dynamic data
- Need routing, state management, and component reusability
- Team development requiring structure and conventions
- Building single-page applications (SPAs)

### When NOT to Use a Framework

- Simple static websites
- Small projects with minimal interactivity
- Learning fundamentals (start with vanilla JS first)

---

## jQuery for DOM Manipulation

### What is jQuery?

- Fast, small, feature-rich JS library
- Simplifies HTML document traversal, event handling, animation
- "Write less, do more"

### jQuery Syntax

```javascript
// Basic syntax: $(selector).action()

$(document).ready(function() {
  // DOM is ready — safe to manipulate
});

// Shorthand
$(function() {
  // DOM ready
});
```

### Selecting Elements

```javascript
// Same as CSS selectors
$("#header");          // id
$(".item");            // class
$("p");                // element
$("div p");            // descendant
$("ul > li");          // child
$("li:first");         // first
$("li:even");          // even-indexed
$("input[type='text']"); // attribute
```

### DOM Manipulation with jQuery

```javascript
// Content
$("#header").text("New text");
$("#header").html("<strong>Bold text</strong>");
$("#header").val();           // form input value

// Attributes
$("a").attr("href", "https://example.com");
$("a").removeAttr("target");
$("div").addClass("active");
$("div").removeClass("hidden");
$("div").toggleClass("visible");

// CSS
$("div").css("color", "red");
$("div").css({ color: "red", fontSize: "16px" });

// Dimensions
$("div").width();
$("div").height();
$("div").innerWidth();   // + padding
$("div").outerWidth();   // + border
```

### Creating and Removing Elements

```javascript
// Create
const $newDiv = $("<div>").text("Hello").addClass("box");

// Insert
$(".container").append($newDiv);     // at end
$(".container").prepend($newDiv);    // at start
$(".container").after($newDiv);      // after container
$(".container").before($newDiv);     // before container

// Remove
$(".item").remove();       // remove element and children
$(".container").empty();   // remove all children
```

### Event Handling with jQuery

```javascript
$("button").click(function() {
  console.log("Clicked");
});

$("button").on("click", function(event) {
  console.log(event.target);
});

// Delegation (for dynamic elements)
$("ul").on("click", "li", function() {
  console.log($(this).text());
});

// Common events
.click(), .dblclick(), .mouseenter(), .mouseleave()
.keydown(), .keyup()
.submit(), .change(), .focus(), .blur()
```

### Effects and Animations

```javascript
$("#element").hide(1000);           // 1 second
$("#element").show("slow");
$("#element").toggle();

$("#element").fadeIn();
$("#element").fadeOut();
$("#element").fadeToggle();

$("#element").slideDown();
$("#element").slideUp();
$("#element").slideToggle();

$("#element").animate({
  left: "200px",
  opacity: 0.5
}, 1000);

// Chaining
$("#element").slideUp().delay(500).slideDown();
```

### AJAX with jQuery

```javascript
$.ajax({
  url: "https://api.example.com/users",
  method: "GET",
  dataType: "json",
  success: function(data) {
    console.log(data);
  },
  error: function(xhr, status, error) {
    console.error(error);
  }
});

// Shorthand methods
$.get("url", function(data) { });
$.post("url", { key: "value" }, function(data) { });
$.getJSON("url", function(data) { });

// Load HTML into element
$("#result").load("ajax/content.html");
```

### jQuery vs Vanilla JS

- jQuery is **less necessary today** — modern browsers have `querySelector`, `fetch`, `classList`
- Use jQuery if:
  - Supporting older browsers (IE)
  - Working with legacy codebase
  - Need rich animation/effects
- Use vanilla JS for:
  - Modern projects
  - Learning fundamentals
  - Reducing bundle size

---

## Key Points

- **console methods** — `log`, `error`, `table`, `time`, `trace`
- **DevTools breakpoints** — most powerful debugging tool
- **Jest** is the most popular JS testing framework
- Testing: unit → integration → E2E (test pyramid)
- **Frameworks** provide structure but add complexity
- **jQuery** simplifies DOM work but is less needed with modern JS
- Always choose the right tool for the project size and team
