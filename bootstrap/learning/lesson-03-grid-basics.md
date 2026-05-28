# Lesson 3: Grid System Basics

Bootstrap's grid uses **flexbox** with **12 columns** across the page.

## Structure

```html
<div class="container">
  <div class="row">
    <div class="col">Column</div>
    <div class="col">Column</div>
  </div>
</div>
```

## Column Classes

```html
<!-- Auto equal width -->
<div class="row">
  <div class="col">1 of 2</div>
  <div class="col">2 of 2</div>
</div>

<!-- Specific widths (must sum to 12) -->
<div class="row">
  <div class="col-4">4 columns</div>
  <div class="col-8">8 columns</div>
</div>

<!-- 3 equal columns -->
<div class="row">
  <div class="col-4">4</div>
  <div class="col-4">4</div>
  <div class="col-4">4</div>
</div>
```

## Responsive Columns

```html
<div class="row">
  <div class="col-sm-8 col-lg-6">8 on sm, 6 on lg</div>
  <div class="col-sm-4 col-lg-6">4 on sm, 6 on lg</div>
</div>
```

- On small screens: 8 + 4
- On large screens: 6 + 6

## Stacked to Horizontal

```html
<!-- Full width on xs, side by side on sm+ -->
<div class="row">
  <div class="col-sm-6">Left</div>
  <div class="col-sm-6">Right</div>
</div>
```

## Column Wrapping

If columns exceed 12, excess wraps to a new line:

```html
<div class="row">
  <div class="col-9">9</div>
  <div class="col-4">4 (this wraps — 13 > 12)</div>
</div>
```

---

## Interview Questions

**Q: How many columns does the Bootstrap grid have?**
A: 12 columns. They can be grouped to create wider columns (e.g. `col-6` + `col-6`, or `col-4` + `col-4` + `col-4`).

**Q: What happens if column widths exceed 12 in a row?**
A: The excess columns wrap to a new line. For example, `col-9` + `col-4` would wrap the second column to the next row.

**Q: What is the difference between `col` and `col-6`?**
A: `.col` creates auto equal-width columns regardless of count. `.col-6` explicitly sets the column to occupy 6 of 12 units (50% width).

**Q: How do you make columns stack on mobile and become horizontal on desktop?**
A: Use breakpoint classes like `col-md-6`. On xs screens they stack (full width), on md+ screens they become side-by-side.
