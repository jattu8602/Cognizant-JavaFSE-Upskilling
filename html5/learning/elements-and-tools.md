# HTML Elements, Attributes & Developer Tools — Learning Notes

## 1. Visual Studio Code Features

| Feature | What it does |
|---------|-------------|
| **Syntax Highlighting** | Color-codes HTML tags, attributes, values |
| **Emmet Abbreviations** | Type `!` + Tab to generate HTML5 boilerplate; `ul>li*5` for 5 list items |
| **IntelliSense** | Auto-completes tag names, attributes, CSS classes |
| **Live Server Extension** | Right-click HTML → "Open with Live Server" for auto-reload |
| **Integrated Terminal** | Run commands without leaving VS Code |
| **Multi-cursor** | `Cmd+click` / `Option+click` to edit multiple lines |
| **Format Document** | `Shift+Option+F` to auto-indent HTML |

---

## 2. Google Chrome DevTools

Open with **F12** or **Cmd+Option+I**.

### Key Tabs

| Tab | Use |
|-----|-----|
| **Elements** | View/edit HTML live; see CSS applied to any element |
| **Console** | Run JS, see errors, `console.log()` output |
| **Network** | Check page load timing, see requests/responses |
| **Sources** | Debug JS with breakpoints |
| **Application** | Inspect localStorage, sessionStorage, cookies |
| **Performance** | Measure page load speed |

### Inspect Element

1. Right-click any element → **Inspect**
2. See the HTML tree in Elements tab
3. Modify text, attributes, or CSS **live** (changes reset on refresh)
4. **Computed** tab shows final CSS values after cascade

---

## 3. HTML Elements & Attributes

### Elements

```html
<tagname>Content</tagname>
```

- **Start tag** + **Content** + **End tag** = Element
- Some are **self-closing** (void elements): `<br>`, `<img>`, `<input>`, `<hr>`

### Attributes

Provide extra info about an element — always in the start tag:

```html
<img src="photo.jpg" alt="Description" width="300">
<a href="https://example.com" target="_blank">Click</a>
<input type="text" placeholder="Enter name" required>
```

### Common Global Attributes

| Attribute | Description |
|-----------|-------------|
| `id` | Unique identifier (one per page) |
| `class` | Reusable class name (multiple elements) |
| `style` | Inline CSS |
| `title` | Tooltip on hover |
| `data-*` | Custom data attributes for JS |

---

## 4. Formatting Tags

| Tag | Effect |
|-----|--------|
| `<b>` / `<strong>` | **Bold** / Important |
| `<i>` / `<em>` | *Italic* / Emphasized |
| `<u>` | <u>Underlined</u> |
| `<mark>` | <mark>Highlighted</mark> |
| `<small>` | <small>Smaller text</small> |
| `<del>` | ~~Deleted~~ |
| `<ins>` | <ins>Inserted</ins> |
| `<sub>` | Subscript (H<sub>2</sub>O) |
| `<sup>` | Superscript (10<sup>2</sup>) |
| `<pre>` | Preformatted (keeps spaces/line breaks) |
| `<code>` | `Inline code` |
| `<blockquote>` | Indented quotation |
| `<hr>` | Horizontal rule (line) |
| `<br>` | Line break |

---

## 5. Lists

### Unordered List
```html
<ul>
  <li>Item 1</li>
  <li>Item 2</li>
</ul>
```
### Ordered List
```html
<ol>
  <li>First</li>
  <li>Second</li>
</ol>
```
### Description List
```html
<dl>
  <dt>Term</dt>
  <dd>Description</dd>
</dl>
```

---

## 6. Tables

```html
<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Age</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>25</td>
    </tr>
  </tbody>
</table>
```

| Tag | Purpose |
|-----|---------|
| `<table>` | Container |
| `<thead>` | Header section |
| `<tbody>` | Body section |
| `<tr>` | Row |
| `<th>` | Header cell (bold, centered) |
| `<td>` | Data cell |
| `colspan="2"` | Merge columns |
| `rowspan="2"` | Merge rows |

---

## 7. Forms & Input Tags

### Basic Form Structure
```html
<form action="/submit" method="post">
  <label for="name">Name:</label>
  <input type="text" id="name" name="name" required>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email">

  <label for="password">Password:</label>
  <input type="password" id="password" name="password">

  <label for="country">Country:</label>
  <select id="country" name="country">
    <option value="">-- Select --</option>
    <option value="us">USA</option>
    <option value="uk">UK</option>
  </select>

  <label for="bio">Bio:</label>
  <textarea id="bio" name="bio" rows="4"></textarea>

  <label>
    <input type="checkbox" name="agree"> I agree
  </label>

  <button type="submit">Submit</button>
</form>
```

### Common Input Types

| Type | Description |
|------|-------------|
| `text` | Single-line text |
| `password` | Masked input |
| `email` | Email validation |
| `number` | Number with min/max/step |
| `date` | Date picker |
| `time` | Time picker |
| `file` | File upload |
| `checkbox` | Multiple choice toggle |
| `radio` | Single choice (group by name) |
| `submit` | Submit button |
| `reset` | Reset form |
| `color` | Color picker |
| `range` | Slider |
| `tel` | Telephone number |
| `url` | URL validation |

### Form Attributes

| Attribute | Description |
|-----------|-------------|
| `action` | URL to send data to |
| `method` | HTTP method (`get` / `post`) |
| `enctype` | Encoding for file uploads (`multipart/form-data`) |
| `autocomplete` | Browser autofill (`on` / `off`) |
| `novalidate` | Skip HTML5 validation |
| `target` | Where to open response (`_blank`, `_self`) |

### Input Attributes

| Attribute | Description |
|-----------|-------------|
| `placeholder` | Hint text inside the field |
| `required` | Field must be filled |
| `autofocus` | Focus on page load |
| `disabled` | Cannot interact |
| `readonly` | Can see but cannot edit |
| `min` / `max` | Min/max values (number, date) |
| `pattern` | Regex validation |
| `step` | Step increment (e.g., `0.5`) |

### `placeholder` Attribute

```html
<input type="text" placeholder="Enter your full name">
<textarea placeholder="Write your message here..."></textarea>
```

- Shows grey hint text inside the input
- Disappears when user starts typing
- **Not a substitute** for `<label>` — labels are for accessibility

---

## 8. Images

```html
<img src="path/to/image.jpg" alt="Description" width="300" height="200" title="Tooltip text">
```

| Attribute | Purpose |
|-----------|---------|
| `src` | Image path (relative or absolute URL) |
| `alt` | Alternative text (accessibility, broken image fallback) |
| `width` / `height` | Dimensions (pixels or %) |
| `title` | Tooltip on hover |
| `loading="lazy"` | Lazy load (load only when visible) |

### Image Formats

| Format | Best for |
|--------|----------|
| JPEG/JPG | Photos with gradients |
| PNG | Graphics with transparency |
| GIF | Simple animations |
| SVG | Icons, logos (scales infinitely) |
| WebP | Modern — smaller size, good quality |

---

## 9. Styles

### 3 Ways to Apply CSS

| Method | Syntax | Scope |
|--------|--------|-------|
| **Inline** | `style="color:red;"` | Single element |
| **Internal** | `<style>` in `<head>` | Single page |
| **External** | `<link rel="stylesheet" href="styles.css">` | Whole site |

```html
<!-- Inline -->
<p style="color: blue; font-size: 18px;">Blue text</p>

<!-- Internal -->
<head>
  <style>
    p { color: blue; }
  </style>
</head>

<!-- External -->
<head>
  <link rel="stylesheet" href="styles.css">
</head>
```

---

## 10. Inline vs Block Elements

### Block Elements
- Start on a **new line**
- Take **full width** available
- Examples: `<div>`, `<p>`, `<h1>`-`<h6>`, `<ul>`, `<ol>`, `<li>`, `<table>`, `<form>`, `<section>`, `<header>`, `<footer>`

### Inline Elements
- Stay on the **same line**
- Take only **as much width as needed**
- Examples: `<span>`, `<a>`, `<img>`, `<strong>`, `<em>`, `<b>`, `<i>`, `<u>`, `<code>`, `<label>`, `<input>`, `<br>`

```html
<p>This is a block element.</p>
<span>This is inline</span>
<span>Also inline — stays on same line</span>
```

---

## 11. `id` vs `class`

| `id` | `class` |
|------|---------|
| **Unique** — one per page | **Reusable** — many elements |
| CSS: `#myId { }` | CSS: `.myClass { }` |
| JS: `document.getElementById('myId')` | JS: `document.getElementsByClassName('myClass')` |
| One element, one id | Many elements, same class |
| Higher CSS specificity | Lower CSS specificity |
| Use for: unique header, single element | Use for: cards, buttons, recurring styles |

```html
<div id="mainHeader">
  <h1 class="title">Welcome</h1>
  <p class="title highlight">This paragraph shares the "highlight" class</p>
</div>
```

```css
#mainHeader { background: blue; }       /* unique banner */
.title { font-size: 24px; }             /* multiple elements */
.highlight { background: yellow; }      /* reusable accent */
```

---

> **Sources:**
> - [w3schools.com/html/html_blocks.asp](https://www.w3schools.com/html/html_blocks.asp)
> - [w3schools.com/tags/](https://www.w3schools.com/tags/)
> - [geeksforgeeks.org/html-forms/](https://www.geeksforgeeks.org/html-forms/)
> - [geeksforgeeks.org/difference-between-id-and-class-attributes-in-html/](https://www.geeksforgeeks.org/difference-between-id-and-class-attributes-in-html/)
