# HTML5 Foundations — Learning Notes

## 1. What is HTML?

**HTML** (Hyper Text Markup Language) is the standard markup language for creating web pages. It describes the **structure** of a web page using elements that tell the browser how to display content.

### Why HTML? Need & Benefits

| Need | Benefit |
|------|---------|
| Structure content on the web | Clean, semantic layout |
| Universal browser support | Works in Chrome, Firefox, Safari, Edge |
| Foundation for all web tech | CSS styles it, JS makes it interactive |
| SEO-friendly | Proper tags help search engines understand content |
| Accessible | Screen readers rely on semantic HTML |

---

## 2. Environment Setup

| Tool | Purpose |
|------|---------|
| **VS Code** | Code editor with syntax highlighting, Emmet, live preview |
| **Google Chrome** | Browser with DevTools for debugging |
| **Live Server** (VS Code extension) | Auto-reloads page on save |

---

## 3. Browser, BOM, and DOM

### DOM (Document Object Model)
- Tree structure of HTML elements that the browser creates
- JavaScript can access and modify it via `document`
- Example: `document.getElementById('title')`

### BOM (Browser Object Model)
- Represents the browser itself (not just the page)
- Accessible via the `window` object
- Includes: `location`, `history`, `navigator`, `screen`, `alert()`, `setTimeout()`

```
window
 ├── document   (DOM)
 ├── location   (URL info)
 ├── history    (back/forward)
 ├── navigator  (browser info)
 └── screen     (display info)
```

---

## 4. DOCTYPE Declaration

```html
<!DOCTYPE html>
```

- **Must be the very first line** of every HTML document
- Tells the browser to render in **standards mode** (not quirks mode)
- This specific declaration is for **HTML5**

---

## 5. Character Encoding

```html
<meta charset="UTF-8">
```

- Placed inside `<head>`
- **UTF-8** supports almost every character from every language
- Prevents mojibake (garbled text) — e.g., `é` showing as `Ã©`

---

## 6. The `<script>` and `<link>` Tags

### `<link>` — Connect external resources
```html
<link rel="stylesheet" href="styles.css">
<link rel="icon" href="favicon.ico">
```

### `<script>` — Add JavaScript
```html
<!-- External JS (recommended) -->
<script src="main.js"></script>

<!-- Inline JS -->
<script>
  console.log('Hello!');
</script>
```

**Best practice:** Place `<script>` just before `</body>` to not block rendering.

---

## 7. HTML5 Document Structure

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Page Title</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>

  <header>
    <nav>Navigation links</nav>
  </header>

  <main>
    <section>
      <h1>Heading</h1>
      <p>Paragraph of text.</p>
    </section>
  </main>

  <footer>
    <p>&copy; 2025</p>
  </footer>

  <script src="main.js"></script>
</body>
</html>
```

### Element Breakdown

| Part | What it does |
|------|-------------|
| `<!DOCTYPE html>` | Declares HTML5 |
| `<html lang="en">` | Root element with language attribute |
| `<head>` | Metadata (not displayed) |
| `<meta charset="UTF-8">` | Character encoding |
| `<meta name="viewport">` | Responsive scaling |
| `<title>` | Page title (shown in browser tab) |
| `<body>` | All visible content goes here |
| `<header>`, `<nav>`, `<main>`, `<section>`, `<footer>` | Semantic HTML5 tags |

---

## 8. HTML Comments

```html
<!-- This is a comment — not displayed in browser -->
<!-- Navigation -->
<nav>...</nav>
<!-- Main Content -->
<main>...</main>
```

- Use comments to label sections of your code
- They help with readability and maintenance

---

## Quick Reference Card

```
HTML Element = <tagname>Content</tagname>

Common tags:
  <h1>-<h6>  →  Headings
  <p>        →  Paragraph
  <a>        →  Link
  <img>      →  Image (self-closing)
  <ul>/<ol>  →  Lists
  <div>      →  Block container
  <span>     →  Inline container

Block vs Inline:
  Block  → Takes full width (h1, p, div)
  Inline → Takes only needed space (span, a, img)
```

---

> **Source:** [w3schools.com/html/html_intro.asp](https://www.w3schools.com/html/html_intro.asp)
