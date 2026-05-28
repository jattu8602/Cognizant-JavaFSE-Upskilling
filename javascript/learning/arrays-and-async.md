# JavaScript - Arrays and Asynchronous Programming

## Arrays

### Creating Arrays

```javascript
const arr = [1, 2, 3, 4, 5];
const mixed = [1, "hello", true, null, { a: 1 }];
const nested = [[1, 2], [3, 4]];
const fromStr = "hello".split("");        // ["h","e","l","l","o"]
const fromIter = Array.from("hello");     // ["h","e","l","l","o"]
const filled = new Array(5).fill(0);      // [0, 0, 0, 0, 0]
```

### Accessing and Modifying

```javascript
arr[0];          // first element
arr[arr.length - 1]; // last element
arr[0] = 10;     // modify

// Destructuring (ES6)
const [first, second, ...rest] = arr;
```

### Adding and Removing

```javascript
arr.push(6);          // add to end
arr.pop();            // remove from end
arr.unshift(0);       // add to beginning
arr.shift();          // remove from beginning

arr.splice(2, 1);     // remove 1 element at index 2
arr.splice(2, 0, "a", "b"); // insert at index 2
arr.splice(2, 1, "x"); // replace at index 2

arr.slice(1, 3);      // extract [1, 3) — returns new array
arr.concat([6, 7]);   // combine arrays — returns new array
```

### Array Methods (Iteration)

```javascript
const arr = [1, 2, 3, 4, 5];

// forEach — iterate (no return)
arr.forEach((item, index) => console.log(index, item));

// map — transform each element, returns new array
const doubled = arr.map(n => n * 2);   // [2, 4, 6, 8, 10]

// filter — keep elements passing test
const evens = arr.filter(n => n % 2 === 0); // [2, 4]

// reduce — accumulate to single value
const sum = arr.reduce((total, n) => total + n, 0); // 15

// find — first element passing test
const found = arr.find(n => n > 3); // 4

// findIndex — index of first match
const idx = arr.findIndex(n => n > 3); // 3

// some — any element passes test?
const hasEven = arr.some(n => n % 2 === 0); // true

// every — all elements pass test?
const allPositive = arr.every(n => n > 0); // true

// includes — check existence
arr.includes(3); // true

// indexOf / lastIndexOf
arr.indexOf(3);  // 2
```

### Sorting

```javascript
const nums = [3, 1, 10, 2];
nums.sort();                       // [1, 10, 2, 3] (lexicographic by default)
nums.sort((a, b) => a - b);        // [1, 2, 3, 10] (ascending)
nums.sort((a, b) => b - a);        // [10, 3, 2, 1] (descending)

const words = ["banana", "Apple", "cherry"];
words.sort();                      // ["Apple", "banana", "cherry"]
words.sort((a, b) => a.localeCompare(b)); // locale-aware
```

### Useful Properties

```javascript
arr.length;             // array length (can be set to truncate)
arr.flat();             // flatten nested arrays (default depth 1)
arr.flat(Infinity);     // fully flatten
arr.join(", ");         // "1, 2, 3, 4, 5"
arr.reverse();          // reverse in place
Array.isArray(arr);     // true
```

---

## Asynchronous JavaScript

JavaScript is **single-threaded** but uses asynchronous patterns for non-blocking operations.

### Synchronous vs Asynchronous

```javascript
// Synchronous (blocking)
console.log("Start");
alert("Blocking");  // waits
console.log("End"); // runs after alert closes

// Asynchronous (non-blocking)
console.log("Start");
setTimeout(() => console.log("Timeout"), 1000);
console.log("End");
// Output: Start, End, Timeout
```

### setTimeout / setInterval

```javascript
// One-time delay
const timerId = setTimeout(() => console.log("Delayed"), 1000);
clearTimeout(timerId);  // cancel

// Repeated interval
const intervalId = setInterval(() => console.log("Tick"), 1000);
clearInterval(intervalId);  // stop
```

---

## Callbacks

A **callback** is a function passed as an argument to be executed later.

```javascript
function fetchData(callback) {
  setTimeout(() => {
    callback("Data received");
  }, 1000);
}

fetchData((result) => {
  console.log(result);
});
```

### Callback Hell

Nested callbacks become hard to read and maintain:

```javascript
getUser(id, (user) => {
  getPosts(user.id, (posts) => {
    getComments(posts[0].id, (comments) => {
      console.log(comments);
    });
  });
});
```

---

## Promises (ES6)

A Promise represents a value that may be available **now, later, or never**.

### Promise States

- **pending** — initial state
- **fulfilled** — operation completed successfully
- **rejected** — operation failed

### Creating a Promise

```javascript
const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    const success = true;
    if (success) {
      resolve("Data loaded");
    } else {
      reject(new Error("Failed to load"));
    }
  }, 1000);
});
```

### Consuming a Promise

```javascript
promise
  .then((result) => {
    console.log(result);   // "Data loaded"
    return "Next step";
  })
  .then((next) => {
    console.log(next);     // "Next step"
  })
  .catch((error) => {
    console.error(error);
  })
  .finally(() => {
    console.log("Always runs");
  });
```

### Promise.all / Promise.race / Promise.allSettled

```javascript
// All must resolve
Promise.all([fetchUser(), fetchPosts()])
  .then(([user, posts]) => console.log(user, posts));

// First to resolve/reject wins
Promise.race([fetchFast(), fetchSlow()])
  .then(result => console.log(result));

// All settle (wait for all, regardless of outcome)
Promise.allSettled([fetchGood(), fetchBad()])
  .then(results => results.forEach(r => console.log(r.status)));
```

---

## Async/Await (ES2017)

Syntactic sugar over Promises — makes async code read like synchronous code.

```javascript
async function loadData() {
  try {
    const user = await fetchUser(id);
    const posts = await fetchPosts(user.id);
    return posts;
  } catch (error) {
    console.error("Failed:", error);
  }
}

// Async functions always return a Promise
loadData().then(data => console.log(data));
```

### Async/Await vs Promises

```javascript
// Promise chain
fetchUser(id)
  .then(user => fetchPosts(user.id))
  .then(posts => console.log(posts))
  .catch(err => console.error(err));

// Async/await (cleaner)
async function showPosts(id) {
  try {
    const user = await fetchUser(id);
    const posts = await fetchPosts(user.id);
    console.log(posts);
  } catch (err) {
    console.error(err);
  }
}
```

### Parallel Execution with Async/Await

```javascript
async function loadAll() {
  const [users, posts] = await Promise.all([
    fetchUsers(),
    fetchPosts()
  ]);
  console.log(users, posts);
}
```

---

## The Event Loop

```
Call Stack → Web APIs → Callback Queue → Event Loop → Call Stack
```

1. **Call Stack** — executes synchronous code
2. **Web APIs** — browser APIs (setTimeout, fetch, DOM events)
3. **Callback Queue** — completed callbacks wait here
4. **Event Loop** — pushes callbacks to call stack when empty

### Microtasks vs Macrotasks

```javascript
console.log("1");                  // sync

setTimeout(() => console.log("2"), 0); // macrotask

Promise.resolve().then(() => {
  console.log("3");                // microtask
});

console.log("4");                  // sync

// Output: 1, 4, 3, 2
```

- **Microtasks** (Promises, queueMicrotask) run before **macrotasks** (setTimeout, setInterval)
- Microtasks queue is drained before each macrotask

---

## Key Points

- **Array methods** — prefer `map`, `filter`, `reduce` over loops
- **Callback Hell** — use Promises or async/await instead
- **Promises** have `.then()` / `.catch()` / `.finally()`
- **Async/await** is syntactic sugar over Promises
- **Event Loop** — understand microtasks vs macrotasks
- Use `Promise.all` for parallel async operations
