# Navigation, Events, Web Forms 2.0, Storage, SQL & Geolocation — Learning Notes

## 1. Navigation Tags & Hyperlinks

### `<nav>` Tag
```html
<nav>
  <a href="#home">Home</a>
  <a href="#events">Events</a>
  <a href="#contact">Contact</a>
</nav>
```
- Defines a **set of navigation links**
- Intended for **major** navigation blocks, not every link on the page
- Screen readers use it to skip or navigate quickly
- Default CSS: `nav { display: block; }`

### `<a>` (Anchor/Hyperlink)
```html
<a href="https://example.com" target="_blank" title="Example">Click me</a>
<a href="#section2">Jump to Section 2</a>     <!-- internal bookmark -->
<a href="mailto:user@example.com">Email</a>    <!-- email link -->
```

| Attribute | Purpose |
|-----------|---------|
| `href` | Destination URL or `#id` for bookmarks |
| `target="_blank"` | Opens in new tab |
| `target="_self"` | Opens in same tab (default) |
| `title` | Tooltip text |

### Sectioning with IDs (Internal References)
```html
<a href="#about">About</a>
...
<section id="about">
  <h2>About Us</h2>
</section>
```

---

## 2. Semantic Sectioning Elements

From HTML5 (tag list via [htmldog.com](https://www.htmldog.com/guides/html/intermediate/sectioning/)):

| Element | Purpose |
|---------|---------|
| `<article>` | Self-contained content (blog post, news story) |
| `<section>` | Generic section (chapter, tab panel) |
| `<header>` | Introductory content for a page or section |
| `<footer>` | Footer for a page or section |
| `<aside>` | Sidebar, pull-quote, related content |
| `<nav>` | Navigation links |
| `<figure>` / `<figcaption>` | Image/media with caption |

```html
<article>
  <header>
    <h1>Article Title</h1>
  </header>
  <section>
    <p>Content...</p>
    <aside>
      <p>Related note...</p>
    </aside>
  </section>
  <footer>Author info</footer>
</article>
```

---

## 3. JavaScript Events

Full reference: [w3schools.com/jsref/dom_obj_event.asp](https://www.w3schools.com/jsref/dom_obj_event.asp)

### Form Events

| Event | When it fires | Example |
|-------|--------------|---------|
| `onblur` | Element loses focus | `onblur="validate(this)"` |
| `onchange` | Value changes (after blur) | `onchange="showFee(this)"` |
| `onfocus` | Element gets focus | `onfocus="highlight(this)"` |
| `onsubmit` | Form is submitted | `onsubmit="return validateForm()"` |
| `onreset` | Form is reset | `onreset="clearForm()"` |
| `oninput` | Value changes (every keystroke) | `oninput="countChars()"` |
| `oninvalid` | Validation fails | `oninvalid="showError()"` |

### Mouse Events

| Event | When it fires |
|-------|--------------|
| `onclick` | Single click |
| `ondblclick` | Double click |
| `onmouseover` / `onmouseout` | Hover enters / leaves |
| `onmousedown` / `onmouseup` | Button pressed / released |
| `oncontextmenu` | Right-click menu |

### Keyboard Events

| Event | When it fires |
|-------|--------------|
| `onkeydown` | Key pressed down |
| `onkeypress` | Key pressed (character keys) |
| `onkeyup` | Key released |

```html
<input type="text" onkeydown="quickSearch(event)">
```

### Window / Document Events

| Event | When it fires |
|-------|--------------|
| `onload` | Page fully loaded |
| `onbeforeunload` | Before leaving the page |
| `onunload` | Page is being unloaded |
| `onresize` | Window resized |
| `onscroll` | Page is scrolled |

### Media Events

| Event | When it fires |
|-------|--------------|
| `oncanplay` | Video/audio ready to play |
| `onplay` | Media starts playing |
| `onpause` | Media paused |
| `onended` | Media finished |
| `ontimeupdate` | Playback position changed |

---

## 4. Web Forms 2.0 (HTML5)

### New Input Types

| Type | Purpose | Example |
|------|---------|---------|
| `date` | Date picker | `<input type="date">` |
| `time` | Time picker | `<input type="time">` |
| `datetime-local` | Date + time (no timezone) | `<input type="datetime-local">` |
| `month` | Month + year | `<input type="month">` |
| `week` | Week number + year | `<input type="week">` |
| `number` | Numeric input with spin | `<input type="number" min="0" max="10">` |
| `range` | Slider | `<input type="range" min="0" max="100">` |
| `email` | Email validation | `<input type="email">` |
| `url` | URL validation | `<input type="url">` |
| `tel` | Telephone number | `<input type="tel">` |
| `color` | Color picker | `<input type="color">` |
| `search` | Search field | `<input type="search">` |

### `<output>` Element
Displays result of a calculation or user action:
```html
<form oninput="result.value = parseInt(a.value) + parseInt(b.value)">
  <input type="number" id="a" value="0"> +
  <input type="number" id="b" value="0"> =
  <output name="result" for="a b">0</output>
</form>
```

### New Form Attributes

| Attribute | Description |
|-----------|-------------|
| `placeholder` | Hint text inside input (disappears on typing) |
| `autofocus` | Auto-focus this field on page load |
| `required` | Field must have a value before submit |
| `autocomplete` | Browser autofill (`on`/`off`) |
| `pattern` | Regex pattern validation |
| `min` / `max` | Range for number/date inputs |
| `step` | Increment step (e.g., `0.5`) |
| `multiple` | Allow multiple values (email, file) |
| `novalidate` | Skip HTML5 validation on form |

```html
<input type="text" placeholder="Full name" autofocus required>
<input type="email" placeholder="email@example.com">
```

---

## 5. Web Storage API

HTML5 Web Storage provides two client-side storage options that are **more secure and faster** than cookies.

### localStorage
Persists even after browser is closed. Data stays until explicitly deleted.
```javascript
// Save
localStorage.setItem('theme', 'dark');
localStorage.setItem('eventType', 'tech');

// Retrieve
const theme = localStorage.getItem('theme');

// Remove one key
localStorage.removeItem('theme');

// Clear all
localStorage.clear();
```

### sessionStorage
Data is cleared when the browser tab is closed.
```javascript
sessionStorage.setItem('tempFilter', 'music');
const filter = sessionStorage.getItem('tempFilter');
sessionStorage.removeItem('tempFilter');
sessionStorage.clear();
```

### Key Differences

| | `localStorage` | `sessionStorage` |
|---|---------------|-----------------|
| Persists after close | Yes | No |
| Tab-specific | No | Yes |
| Capacity | ~5-10MB | ~5-10MB |
| Cleared by | JS or user clears data | Closing tab |

---

## 6. Web SQL Database (Deprecated)

> **Note:** Web SQL is **deprecated** and not part of the HTML5 spec. It still works in Chromium-based browsers but is being phased out. Consider **IndexedDB** as the modern alternative.

### Core Methods

| Method | Purpose |
|--------|---------|
| `openDatabase()` | Open or create a database |
| `transaction()` | Start a transaction (commit/rollback) |
| `executeSql()` | Run a SQL query |

### Usage
```javascript
// Open/create database
const db = openDatabase('mydb', '1.0', 'Client-side DB', 2 * 1024 * 1024);

// Create table and insert
db.transaction(function(tx) {
  tx.executeSql('CREATE TABLE IF NOT EXISTS events (id unique, title, date)');
  tx.executeSql('INSERT INTO events (id, title, date) VALUES (?, ?, ?)',
    [1, 'Tech Meetup', '2025-06-10']);
});

// Read data
db.transaction(function(tx) {
  tx.executeSql('SELECT * FROM events', [], function(tx, results) {
    for (let i = 0; i < results.rows.length; i++) {
      console.log(results.rows.item(i).title);
    }
  });
});
```

### Parameters
1. `openDatabase(name, version, description, size)`
2. `tx.executeSql(sql, [params], successCallback, errorCallback)`

---

## 7. Geolocation API

Accesses the user's geographical location (requires user permission).

### Core Method

```javascript
navigator.geolocation.getCurrentPosition(successCallback, errorCallback, options);
```

### Location Properties (Position object)

| Property | Returns |
|----------|---------|
| `coords.latitude` | Latitude (decimal) |
| `coords.longitude` | Longitude (decimal) |
| `coords.accuracy` | Accuracy in meters |
| `coords.altitude` | Altitude above sea level (m) |
| `coords.altitudeAccuracy` | Altitude accuracy (m) |
| `coords.heading` | Direction (degrees clockwise from North) |
| `coords.speed` | Speed (m/s) |
| `timestamp` | Time of response |

### Error Handling

```javascript
function handleError(err) {
  switch (err.code) {
    case err.PERMISSION_DENIED:
      console.log('User denied location access');
      break;
    case err.POSITION_UNAVAILABLE:
      console.log('Location unavailable');
      break;
    case err.TIMEOUT:
      console.log('Request timed out');
      break;
    case err.UNKNOWN_ERROR:
      console.log('Unknown error');
      break;
  }
}
```

### Position Options

```javascript
const options = {
  enableHighAccuracy: true,   // Use GPS if available
  timeout: 10000,             // Max wait time (ms)
  maximumAge: 0               // Don't use cached position
};

navigator.geolocation.getCurrentPosition(success, handleError, options);
```

### Other Geolocation Methods

| Method | Purpose |
|--------|---------|
| `watchPosition()` | Continuously watch position (returns watch ID) |
| `clearWatch(id)` | Stop watching position |

```javascript
const watchId = navigator.geolocation.watchPosition(success, error);
navigator.geolocation.clearWatch(watchId);
```

---

> **Sources:**
> - [w3schools.com/tags/tag_nav.asp](https://www.w3schools.com/tags/tag_nav.asp)
> - [htmldog.com/guides/html/intermediate/sectioning/](https://www.htmldog.com/guides/html/intermediate/sectioning/)
> - [w3schools.com/jsref/dom_obj_event.asp](https://www.w3schools.com/jsref/dom_obj_event.asp)
> - [tutorialspoint.com/html5/html5_web_forms2.htm](https://www.tutorialspoint.com/html5/html5_web_forms2.htm)
> - [w3schools.com/html/html5_webstorage.asp](https://www.w3schools.com/html/html5_webstorage.asp)
> - [geeksforgeeks.org/what-is-web-sql/](https://www.geeksforgeeks.org/what-is-web-sql/)
> - [geeksforgeeks.org/html-geolocation/](https://www.geeksforgeeks.org/html-geolocation/)
