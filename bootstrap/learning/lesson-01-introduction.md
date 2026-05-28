# Lesson 1: Introduction to Bootstrap 5

## What is Bootstrap?

A **free front-end framework** for building responsive, mobile-first websites. It provides pre-built HTML/CSS components and JavaScript plugins.

## Bootstrap 5 vs Bootstrap 4

| Feature | BS5 | BS4 |
|---|---|---|
| JavaScript | Vanilla JS (no jQuery) | jQuery required |
| IE Support | No | IE 10+ |
| Grid tiers | 6 (xs to xxl) | 5 |
| New Components | Offcanvas, dark mode, floating labels | -- |

## Setup via CDN

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>BS5 Page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <h1>Hello, Bootstrap!</h1>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
```

## Breakpoints

| Infix | Min Width | Container |
|---|---|---|
| xs | <576px | 100% |
| sm | >=576px | 540px |
| md | >=768px | 720px |
| lg | >=992px | 960px |
| xl | >=1200px | 1140px |
| xxl | >=1400px | 1320px |

---

## Interview Questions

**Q: What are the key differences between Bootstrap 5 and Bootstrap 4?**
A: Bootstrap 5 dropped jQuery (vanilla JS), removed IE support, added 6th grid tier (xxl), introduced offcanvas, floating labels, and dark mode.

**Q: What does the viewport meta tag do in Bootstrap?**
A: `<meta name="viewport" content="width=device-width, initial-scale=1">` ensures the page width matches the device screen width and sets initial zoom to 1, enabling proper responsive behavior on mobile devices.

**Q: Why are containers necessary in Bootstrap?**
A: Containers (`.container`, `.container-fluid`) wrap content, provide responsive widths, and center the layout with automatic margins. The grid system requires a container to function correctly.
