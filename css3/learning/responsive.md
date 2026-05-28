# CSS3 Responsive Web Design (RWD)

## Viewport

The viewport is the user's visible area of a web page.

```html
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```

- `width=device-width` - matches screen width
- `initial-scale=1.0` - no zoom on load

Without this meta tag, mobile browsers simulate a ~980px viewport.

## CSS Media Queries

Apply styles based on device characteristics:

### Syntax

```css
@media [not] media-type and (media-feature: value) {
  /* CSS rules */
}
```

### Media Types

| Value | Description |
|---|---|
| `all` | All devices (default) |
| `screen` | Computer screens, tablets, phones |
| `print` | Print preview / printed pages |

### Common Media Features

```css
/* Width-based */
@media (max-width: 768px) { ... }
@media (min-width: 480px) { ... }
@media (min-width: 480px) and (max-width: 768px) { ... }

/* Orientation */
@media (orientation: landscape) { ... }
@media (orientation: portrait) { ... }

/* Height-based */
@media (min-height: 500px) { ... }

/* Resolution */
@media (min-resolution: 300dpi) { ... }

/* Color scheme preference */
@media (prefers-color-scheme: dark) { ... }
@media (prefers-color-scheme: light) { ... }
```

### Examples

```css
/* Background change when viewport >= 480px */
@media screen and (min-width: 480px) {
  body { background-color: lightgreen; }
}

/* Between 480px and 768px */
@media screen and (min-width: 480px) and (max-width: 768px) {
  body { background-color: lightgreen; }
}

/* Mobile-first: default styles for small screens */
.container { width: 100%; }

/* Tablet */
@media (min-width: 768px) {
  .container { width: 750px; margin: 0 auto; }
}

/* Desktop */
@media (min-width: 1024px) {
  .container { width: 960px; }
}
```

### Breakpoints (Common)

```css
/* Extra small devices (phones, <576px) */

/* Small devices (landscape phones, >=576px) */
@media (min-width: 576px) { ... }

/* Medium devices (tablets, >=768px) */
@media (min-width: 768px) { ... }

/* Large devices (desktops, >=992px) */
@media (min-width: 992px) { ... }

/* Extra large (large desktops, >=1200px) */
@media (min-width: 1200px) { ... }
```

## RWD Principles

### 1. Fluid Grids

Use relative units instead of fixed pixels:

```css
.container {
  width: 100%;
  max-width: 1200px;
}

.column {
  width: 50%;       /* percentage instead of px */
  float: left;
}
```

### 2. Flexible Images

```css
img {
  max-width: 100%;
  height: auto;
}
```

### 3. Media Queries

Conditional styling based on viewport size.

### 4. Responsive Typography

```css
/* Use relative units */
body { font-size: 16px; }

/* Fluid typography with clamp() - CSS3 */
h1 { font-size: clamp(1.5rem, 5vw, 3rem); }
```

## CSS Flexbox

One-dimensional layout model (row or column).

### Flex Container

```css
.container {
  display: flex;
  flex-direction: row;           /* default: row */
  flex-direction: column;
  flex-wrap: wrap;
  justify-content: center;       /* main axis alignment */
  align-items: center;           /* cross axis alignment */
  gap: 10px;                     /* space between items */
}
```

### Flex Items

```css
.item {
  flex: 1;                 /* grow, shrink, basis */
  flex: 0 0 auto;          /* explicit: grow shrink basis */
  flex: 1 0 200px;         /* grow, don't shrink, start at 200px */
  align-self: center;      /* override align-items for this item */
  order: 2;                /* reorder items (default 0) */
}
```

### Flex Properties Summary

| Property | Values | Description |
|---|---|---|
| `flex-direction` | `row` `column` `row-reverse` `column-reverse` | Main axis direction |
| `flex-wrap` | `nowrap` `wrap` `wrap-reverse` | Allow wrapping |
| `justify-content` | `flex-start` `flex-end` `center` `space-between` `space-around` `space-evenly` | Main axis alignment |
| `align-items` | `stretch` `flex-start` `flex-end` `center` `baseline` | Cross axis alignment |
| `align-content` | (same as justify) | Multi-line cross axis |
| `gap` | length | Space between items |

### Responsive Flex Layout

```css
.container {
  display: flex;
  flex-wrap: wrap;
}

.item {
  flex: 1 0 300px;  /* grow, no shrink, min 300px */
}
```

## CSS Grid

Two-dimensional layout (rows AND columns).

### Grid Container

```css
.container {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;   /* 3 equal columns */
  grid-template-columns: repeat(3, 1fr); /* same */
  grid-template-rows: auto 200px;
  gap: 20px;                              /* row-gap column-gap shorthand */
}
```

### Grid Items

```css
.item {
  grid-column: 1 / 3;   /* span from column line 1 to 3 */
  grid-column: span 2;   /* span 2 columns */
  grid-row: 1 / 3;
}
```

### Responsive Grid

```css
/* Auto-fill columns with minimum 250px, max 1fr */
.container {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
  gap: 20px;
}
```

### Grid vs Flexbox

| Scenario | Use |
|---|---|
| One-dimensional layout (row or column) | Flexbox |
| Two-dimensional layout (rows AND columns) | Grid |
| Content-driven layout (size based on content) | Flexbox |
| Layout-driven design (define structure first) | Grid |

## CSS Units

### Relative Units (preferred for RWD)

| Unit | Description |
|---|---|
| `%` | Percentage of parent |
| `em` | Relative to parent font-size |
| `rem` | Relative to root (`<html>`) font-size (16px default) |
| `vw` | 1% of viewport width |
| `vh` | 1% of viewport height |
| `vmin` | 1% of the smaller dimension (vw/vh) |
| `vmax` | 1% of the larger dimension |
| `fr` | Fraction of available space (grid/flex) |

### Absolute Units

| Unit | Description |
|---|---|
| `px` | Pixels (1px = 1/96th of 1 inch) |
| `pt` | Points (1pt = 1/72nd of 1 inch) |
| `cm` | Centimeters |
| `mm` | Millimeters |
| `in` | Inches |

## Key Points

- Always include `<meta name="viewport">` for mobile
- Use **relative units** (`%`, `rem`, `vw`) over fixed ones
- **Media queries** change styles at breakpoints
- **Flexbox** for one-direction layouts
- **Grid** for two-direction layouts
- **Mobile-first**: write base styles for small screens, add media queries for larger
- Use `clamp()` for fluid typography: `font-size: clamp(min, preferred, max)`
