# Bootstrap 5 - Introduction & Setup

## What is Bootstrap?

- Free front-end framework for faster and easier web development
- HTML + CSS based design templates for typography, forms, buttons, tables, navigation, modals, carousels, etc.
- Optional JavaScript plugins for interactivity
- **Responsive** and **mobile-first** by default

## Bootstrap 5 vs Previous Versions

| Feature | Bootstrap 5 | Bootstrap 4 |
|---|---|---|
| JavaScript | Vanilla JS (no jQuery) | jQuery required |
| IE Support | No IE 11 support | IE 10+ |
| Grid | 6 tiers (`xs` to `xxl`) | 5 tiers |
| Utilities | New RTL, dark mode, offcanvas | Limited |
| Forms | New form controls, floating labels | Older form styles |

## Setting Up Bootstrap 5

### Option 1: CDN (Recommended)

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap 5 Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- Bootstrap JS Bundle (includes Popper) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
  <h1>Hello, Bootstrap!</h1>
</body>
</html>
```

### Option 2: Download / npm

```bash
npm install bootstrap@5
```

## Key HTML Structure

### HTML5 Doctype Required

```html
<!DOCTYPE html>
<html lang="en">
```

### Viewport Meta Tag

```html
<meta name="viewport" content="width=device-width, initial-scale=1">
```

- `width=device-width` — matches screen width
- `initial-scale=1` — no zoom on load

## Containers

Bootstrap requires a container element to wrap content.

### .container (Responsive Fixed Width)

```html
<div class="container">
  <!-- content -->
</div>
```

- Max-width changes at each breakpoint (540px → 720px → 960px → 1140px → 1320px)
- Centered with `margin: auto`

### .container-fluid (Full Width)

```html
<div class="container-fluid">
  <!-- content -->
</div>
```

- Always `width: 100%` across all viewports

### .container-{breakpoint}

```html
<div class="container-sm">  /* 100% until sm breakpoint */
<div class="container-md">  /* 100% until md breakpoint */
<div class="container-lg">  /* 100% until lg breakpoint */
<div class="container-xl">  /* 100% until xl breakpoint */
<div class="container-xxl"> /* 100% until xxl breakpoint */
```

## Bootstrap Breakpoints

| Breakpoint | Class Infix | Min Width |
|---|---|---|
| X-Small | *(none)* | <576px |
| Small | `sm` | >=576px |
| Medium | `md` | >=768px |
| Large | `lg` | >=992px |
| Extra Large | `xl` | >=1200px |
| XX-Large | `xxl` | >=1400px |

## Bootstrap Files Structure

```
bootstrap/
├── css/
│   ├── bootstrap.css          (uncompressed)
│   ├── bootstrap.min.css      (compressed — use in production)
│   ├── bootstrap-grid.css     (grid only)
│   ├── bootstrap-reboot.css   (reboot/normalize only)
│   └── bootstrap-utilities.css (utilities only)
├── js/
│   ├── bootstrap.bundle.js    (includes Popper)
│   ├── bootstrap.bundle.min.js
│   ├── bootstrap.js           (without Popper)
│   └── bootstrap.min.js
└── scss/                      (Sass source files)
```

## Color Palette

Bootstrap uses contextual color names:

| Class | Color | Usage |
|---|---|---|
| `primary` | Blue | Main brand color |
| `secondary` | Gray | Secondary elements |
| `success` | Green | Success states |
| `danger` | Red | Errors / danger |
| `warning` | Yellow | Warnings |
| `info` | Light blue | Informational |
| `light` | Light gray | Light backgrounds |
| `dark` | Dark gray/black | Dark backgrounds |
| `white` | White | White text/bg |
| `muted` | Faded text | Secondary text |

---

## Bootstrap 5 Starter Template

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Bootstrap 5 Starter</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container p-5 my-5 bg-primary text-white text-center">
    <h1>My First Bootstrap Page</h1>
    <p>Resize the page to see the responsive effect!</p>
  </div>

  <div class="container">
    <div class="row">
      <div class="col-sm-4">Column 1</div>
      <div class="col-sm-4">Column 2</div>
      <div class="col-sm-4">Column 3</div>
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
```

## Key Points

- Always include `<!DOCTYPE html>` and viewport meta
- Use CDN for quick setup (no downloads)
- `.container` for fixed-width, `.container-fluid` for full-width
- Bootstrap 5 = **no jQuery** required (vanilla JS)
- Mobile-first: design for small screens first, then add breakpoints
- 6 responsive breakpoints (`xs` through `xxl`)
- Contextual colors (`primary`, `success`, `danger`, etc.) used everywhere
