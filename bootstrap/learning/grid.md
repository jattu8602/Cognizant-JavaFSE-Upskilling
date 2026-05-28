# Bootstrap 5 Grid System

## Overview

Bootstrap's grid is built with **flexbox** and allows up to **12 columns** across the page.

### Basic Structure

```html
<div class="container">
  <div class="row">
    <div class="col-*">Column</div>
    <div class="col-*">Column</div>
  </div>
</div>
```

- `.container` (or `.container-fluid`) — wrapper
- `.row` — horizontal group of columns
- `.col-{breakpoint}-{size}` — individual columns

Columns must sum to **12 or fewer** per row (they don't have to use all 12).

## Grid Classes (6 Tiers)

| Class | Breakpoint | Min Width |
|---|---|---|
| `.col-` | Extra small | <576px |
| `.col-sm-` | Small | >=576px |
| `.col-md-` | Medium | >=768px |
| `.col-lg-` | Large | >=992px |
| `.col-xl-` | Extra Large | >=1200px |
| `.col-xxl-` | XX-Large | >=1400px |

## Equal-Width Columns

```html
<!-- Auto equal width -->
<div class="row">
  <div class="col">1 of 3</div>
  <div class="col">2 of 3</div>
  <div class="col">3 of 3</div>
</div>

<!-- Numeric sizing -->
<div class="row">
  <div class="col-4">4 columns</div>
  <div class="col-8">8 columns</div>
</div>
```

## Responsive Columns

Specify different widths for different breakpoints:

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
<!-- Columns stack on xs (full width), horizontal on sm+ -->
<div class="row">
  <div class="col-sm-8">8 columns on sm+</div>
  <div class="col-sm-4">4 columns on sm+</div>
</div>
```

## Column Wrapping

If more than 12 column units are placed in a single row, the excess wraps to a new line:

```html
<div class="row">
  <div class="col-9">9</div>
  <div class="col-4">4 (wraps to new line — 9+4=13 > 12)</div>
</div>
```

## Column Offsets

Use `.offset-{breakpoint}-{size}` to shift columns to the right:

```html
<div class="row">
  <div class="col-4">Left</div>
  <div class="col-4 offset-4">Right (offset by 4)</div>
</div>
```

## Column Ordering

Use `.order-{breakpoint}-{number}` to reorder columns:

```html
<div class="row">
  <div class="col order-3">First in DOM, last displayed</div>
  <div class="col order-1">Second in DOM, first displayed</div>
  <div class="col order-2">Third in DOM, second displayed</div>
</div>
```

Special classes: `.order-first` (order: -1), `.order-last` (order: 6)

## Nesting

Rows can be nested inside columns:

```html
<div class="row">
  <div class="col-6">
    <div class="row">
      <div class="col-4">Nested 1</div>
      <div class="col-8">Nested 2</div>
    </div>
  </div>
  <div class="col-6">Main column 2</div>
</div>
```

## Gutters

Control spacing between columns with `.g-*` classes:

```html
<div class="row g-0">      <!-- No gutters -->
<div class="row g-2">      <!-- Small gutters (.5rem) -->
<div class="row g-4">      <!-- Medium gutters (1.5rem) -->
<div class="row g-5">      <!-- Large gutters (3rem) -->

<!-- Horizontal/vertical only -->
<div class="row gx-4">     <!-- Horizontal gutters only -->
<div class="row gy-4">     <!-- Vertical gutters only -->
```

## Row Columns

Use `.row-cols-*` to set equal-width columns at the row level:

```html
<!-- 3 equal columns on all breakpoints -->
<div class="row row-cols-3">
  <div class="col">Column</div>
  <div class="col">Column</div>
  <div class="col">Column</div>
</div>

<!-- Responsive row columns -->
<div class="row row-cols-2 row-cols-md-3 row-cols-lg-4">
  <div class="col">1</div>
  <div class="col">2</div>
  <div class="col">3</div>
  <div class="col">4</div>
  <div class="col">5</div>
  <div class="col">6</div>
</div>
```

## Responsive Flexbox Utilities

Bootstrap provides flex utility classes since the grid itself is flexbox-based.

### Flex Direction

```html
<div class="d-flex flex-row">...</div>         <!-- Default: row -->
<div class="d-flex flex-row-reverse">...</div> <!-- Reverse row -->
<div class="d-flex flex-column">...</div>      <!-- Column -->
<div class="d-flex flex-column-reverse">...</div>
```

### Justify Content (Main Axis)

```html
<div class="d-flex justify-content-start">...</div>
<div class="d-flex justify-content-end">...</div>
<div class="d-flex justify-content-center">...</div>
<div class="d-flex justify-content-between">...</div>
<div class="d-flex justify-content-around">...</div>
<div class="d-flex justify-content-evenly">...</div>
```

### Align Items (Cross Axis)

```html
<div class="d-flex align-items-start">...</div>
<div class="d-flex align-items-end">...</div>
<div class="d-flex align-items-center">...</div>
<div class="d-flex align-items-baseline">...</div>
<div class="d-flex align-items-stretch">...</div>
```

### Flex Wrap

```html
<div class="d-flex flex-wrap">...</div>
<div class="d-flex flex-wrap-reverse">...</div>
<div class="d-flex flex-nowrap">...</div>
```

### Align Self (Individual Item)

```html
<div class="align-self-start">...</div>
<div class="align-self-end">...</div>
<div class="align-self-center">...</div>
```

### Responsive Flex Classes

All flex classes work at breakpoints:

```html
<div class="d-flex d-md-inline-flex">
<div class="d-sm-flex flex-lg-row">
```

---

## Grid Container Widths

| Breakpoint | Container Max-Width |
|---|---|
| xs (<576px) | 100% (auto) |
| sm (>=576px) | 540px |
| md (>=768px) | 720px |
| lg (>=992px) | 960px |
| xl (>=1200px) | 1140px |
| xxl (>=1400px) | 1320px |

## Key Points

- 12-column flexbox grid with 6 responsive tiers
- `.col-{bp}-{size}` — specify exact column width
- `.col` — auto equal-width columns
- `.offset-{bp}-{size}` — shift columns right
- `.order-{bp}-{number}` — reorder columns
- `.row-cols-{n}` — set column count at row level
- `.g-*` / `.gx-*` / `.gy-*` — gutter spacing
- All flex utilities are available as `.d-flex` + alignment classes
- Responsive variants: `sm`, `md`, `lg`, `xl`, `xxl`
