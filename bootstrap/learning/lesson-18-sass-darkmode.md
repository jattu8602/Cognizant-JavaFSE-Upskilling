# Lesson 18: Sass Customization and Dark Mode

Bootstrap is built with Sass, making it highly customizable.

## Why Customize with Sass?

- Change all primary buttons by overriding one variable
- Create a consistent brand theme
- Reduce file size by importing only needed components

## Project Setup

```bash
npm init -y
npm install bootstrap
npm install sass --save-dev
```

## Custom SCSS File

Create `custom.scss`:

```scss
// 1. Override variables BEFORE importing Bootstrap
$primary: #6f42c1;        // Purple theme
$danger: #e83e8c;
$border-radius: 0.5rem;
$font-family-sans-serif: "Inter", sans-serif;

// 2. Import Bootstrap
@import "../node_modules/bootstrap/scss/bootstrap";
```

## Compile

```bash
npx sass custom.scss custom.css
```

Then link `custom.css` in your HTML instead of `bootstrap.min.css`.

## Common Variables to Override

```scss
// Colors
$primary:   #0d6efd;
$secondary: #6c757d;
$success:   #198754;
$danger:    #dc3545;
$warning:   #ffc107;
$info:      #0dcaf0;

// Typography
$font-size-base: 1rem;
$font-family-sans-serif: system-ui, sans-serif;
$headings-font-weight: 700;

// Grid
$grid-columns: 12;
$grid-gutter-width: 1.5rem;

// Spacing
$spacer: 1rem;

// Borders
$border-radius: 0.375rem;
$border-radius-lg: 0.5rem;
$border-radius-sm: 0.25rem;

// Buttons
$btn-padding-y: 0.5rem;
$btn-padding-x: 1.5rem;
$btn-border-radius: 0.5rem;
```

## Example: Custom Brand Theme

```scss
// brand.scss
$primary: #ff5733;
$enable-shadows: true;
$enable-gradients: true;
$body-bg: #f8f9fa;
$body-color: #333;

@import "bootstrap/scss/bootstrap";
```

## Import Only What You Need

```scss
// Minimal Bootstrap
@import "bootstrap/scss/functions";
@import "bootstrap/scss/variables";
@import "bootstrap/scss/maps";
@import "bootstrap/scss/mixins";
@import "bootstrap/scss/root";

@import "bootstrap/scss/reboot";
@import "bootstrap/scss/type";
@import "bootstrap/scss/grid";
@import "bootstrap/scss/buttons";
@import "bootstrap/scss/forms";
@import "bootstrap/scss/nav";
@import "bootstrap/scss/navbar";
@import "bootstrap/scss/card";
@import "bootstrap/scss/utilities";
@import "bootstrap/scss/utilities/api";
```

## Adding Custom Colors

```scss
$custom-colors: (
  "orange": #fd7e14,
  "teal": #20c997
);
$theme-colors: map-merge($theme-colors, $custom-colors);
// Now use: class="btn btn-orange" or class="bg-teal"
```

## Utility API

Generate custom utility classes:

```scss
$utilities: map-merge(
  $utilities,
  (
    "cursor": (
      property: cursor,
      values: pointer default grab
    ),
    "opacity": (
      property: opacity,
      class: opacity,
      values: (
        0: 0,
        25: .25,
        50: .5,
        75: .75,
        100: 1,
      )
    )
  )
);
```

---

## Dark Mode (Bootstrap 5.3+)

### Enable via HTML

```html
<html data-bs-theme="dark">
```

### Toggle with JavaScript

```html
<button id="themeToggle">Toggle Dark Mode</button>

<script>
  document.getElementById('themeToggle').addEventListener('click', () => {
    const html = document.querySelector('html');
    const current = html.getAttribute('data-bs-theme');
    html.setAttribute('data-bs-theme', current === 'dark' ? 'light' : 'dark');
  });
</script>
```

### Custom Dark Mode with Sass

```scss
$color-mode-type: media-query;  // Uses prefers-color-scheme media query

@import "bootstrap/scss/bootstrap";
```

---

## Interview Questions

**Q: What is the advantage of customizing Bootstrap with Sass?**
A: You can change all instances of a color globally by overriding one variable (e.g., `$primary`), instead of manually overriding CSS in multiple places. You can also reduce file size by importing only needed components.

**Q: How do you add a custom color to Bootstrap's theme?**
A: Merge a custom colors map into `$theme-colors` using `map-merge`. Example: add "purple" as a new color, then use `btn-purple`, `bg-purple`, `text-purple`, etc.

**Q: How does Bootstrap 5.3+ support dark mode?**
A: Through the `data-bs-theme` attribute on `<html>`. Set it to `"dark"` or `"light"`. You can toggle it with JavaScript or use the `prefers-color-scheme` media query via Sass (`$color-mode-type: media-query`).

**Q: What is the Utility API in Bootstrap 5?**
A: It's a Sass map that generates utility classes. You can add custom utilities (e.g., `cursor: pointer`) by merging into the `$utilities` map, and Bootstrap generates all the corresponding responsive classes automatically.
