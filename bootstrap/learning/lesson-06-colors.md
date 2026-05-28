# Lesson 6: Colors and Backgrounds

Bootstrap uses contextual color names throughout all components.

## Text Colors

```html
<p class="text-primary">Primary (blue)</p>
<p class="text-secondary">Secondary (gray)</p>
<p class="text-success">Success (green)</p>
<p class="text-danger">Danger (red)</p>
<p class="text-warning">Warning (yellow)</p>
<p class="text-info">Info (light blue)</p>
<p class="text-light bg-dark">Light (white, needs dark bg)</p>
<p class="text-dark">Dark (dark gray)</p>
<p class="text-muted">Muted (faded)</p>
<p class="text-white bg-dark">White</p>
<p class="text-body">Body (default)</p>
```

## Background Colors

```html
<div class="bg-primary">Primary background</div>
<div class="bg-secondary">Secondary</div>
<div class="bg-success">Success</div>
<div class="bg-danger">Danger</div>
<div class="bg-warning">Warning</div>
<div class="bg-info">Info</div>
<div class="bg-light">Light</div>
<div class="bg-dark text-white">Dark</div>
<div class="bg-white">White</div>
<div class="bg-transparent">Transparent</div>
```

## Auto-Contrast (BS5.3+)

Bootstrap automatically picks the right text color for each background:

```html
<div class="text-bg-primary">Primary with auto text</div>
<div class="text-bg-success">Success with auto text</div>
<div class="text-bg-danger">Danger with auto text</div>
<div class="text-bg-warning">Warning with auto text</div>
<div class="text-bg-info">Info with auto text</div>
<div class="text-bg-dark">Dark with auto text</div>
```

## Opacity (BS5.3+)

```html
<div class="text-primary text-opacity-75">75% opacity</div>
<div class="bg-primary bg-opacity-50">50% opacity</div>
```

---

## Interview Questions

**Q: How are contextual colors used in Bootstrap?**
A: Through classes like `.text-primary`, `.bg-success`, `.btn-danger`, `.alert-warning`, etc. They use CSS variables and Sass maps for consistency across components.

**Q: What is the difference between `.bg-danger` and `.text-bg-danger`?**
A: `.bg-danger` only sets the background color (you need `.text-white` for legible text). `.text-bg-danger` automatically sets both background AND a contrasting text color using CSS color contrast logic.

**Q: Can you change Bootstrap's color scheme?**
A: Yes, by overriding Sass variables (`$primary`, `$danger`, etc.) before importing Bootstrap, or by using CSS custom properties in BS5.3+.
