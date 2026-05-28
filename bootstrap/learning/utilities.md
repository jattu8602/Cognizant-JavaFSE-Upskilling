# Bootstrap 5 Utilities & Helpers

Utility classes let you style elements quickly **without writing custom CSS**.

## Spacing

Format: `{property}{sides}-{size}` or `{property}{sides}-{breakpoint}-{size}`

### Property

| Prefix | CSS Property |
|---|---|
| `m` | `margin` |
| `p` | `padding` |

### Sides

| Suffix | Sides |
|---|---|
| `t` | top |
| `b` | bottom |
| `s` | left (start) |
| `e` | right (end) |
| `x` | left + right |
| `y` | top + bottom |
| *(blank)* | all 4 sides |

### Sizes

| Size | rem | px (approx) |
|---|---|---|
| `0` | 0 | 0 |
| `1` | 0.25rem | 4px |
| `2` | 0.5rem | 8px |
| `3` | 1rem | 16px |
| `4` | 1.5rem | 24px |
| `5` | 3rem | 48px |
| `auto` | auto | auto |

### Examples

```html
<div class="m-3">Margin all sides (1rem)</div>
<div class="mt-4">Margin top only (1.5rem)</div>
<div class="mx-auto">Center horizontally</div>
<div class="py-5">Padding top+bottom (3rem)</div>
<div class="ps-2">Padding left (0.5rem)</div>
<div class="p-0">No padding</div>

<!-- Responsive -->
<div class="mt-3 mt-md-5">Spacing changes at md breakpoint</div>
```

---

## Colors

### Text Colors

```html
<p class="text-primary">Primary text</p>
<p class="text-secondary">Secondary text</p>
<p class="text-success">Success text</p>
<p class="text-danger">Danger text</p>
<p class="text-warning">Warning text</p>
<p class="text-info">Info text</p>
<p class="text-light bg-dark">Light text</p>
<p class="text-dark">Dark text</p>
<p class="text-muted">Muted text</p>
<p class="text-white bg-dark">White text</p>
<p class="text-body">Body text</p>
<p class="text-black-50">Black 50% opacity</p>
<p class="text-white-50 bg-dark">White 50% opacity</p>
```

### Background Colors

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

### Text + Background (Auto-contrast)

```html
<div class="text-bg-primary">Primary with auto text color</div>
<div class="text-bg-success">Success with auto text color</div>
<div class="text-bg-dark">Dark with auto text color</div>
```

---

## Display

```html
<div class="d-block">Block display</div>
<div class="d-inline">Inline display</div>
<div class="d-inline-block">Inline-block</div>
<div class="d-flex">Flex display</div>
<div class="d-grid">Grid display</div>
<div class="d-none">Hidden (display: none)</div>

<!-- Responsive display -->
<div class="d-none d-md-block">Hidden on xs/sm, visible on md+</div>
<div class="d-block d-md-none">Visible on xs/sm, hidden on md+</div>
<div class="d-print-block">Only visible when printing</div>
<div class="d-print-none">Hidden when printing</div>
```

---

## Visibility

```html
<div class="visible">Element is visible</div>
<div class="invisible">Element is hidden (still takes space)</div>
```

- `.visible` — `visibility: visible`
- `.invisible` — `visibility: hidden` (element still occupies layout space)
- Unlike `.d-none` (which removes element from flow)

---

## Borders

```html
<!-- Add borders -->
<div class="border">All sides</div>
<div class="border-top">Top only</div>
<div class="border-end">Right only</div>
<div class="border-bottom">Bottom only</div>
<div class="border-start">Left only</div>

<!-- Remove borders -->
<div class="border border-0">No border</div>
<div class="border border-top-0">No top border</div>

<!-- Border width -->
<div class="border border-1">Thin</div>
<div class="border border-2">Medium</div>
<div class="border border-3">Thicker</div>
<div class="border border-4">Thick</div>
<div class="border border-5">Thickest</div>

<!-- Border color -->
<div class="border border-primary">Primary border</div>
<div class="border border-danger">Danger border</div>
<div class="border border-success">Success border</div>
```

---

## Shadows

```html
<div class="shadow-none">No shadow</div>
<div class="shadow-sm">Small shadow</div>
<div class="shadow">Default shadow</div>
<div class="shadow-lg">Large shadow</div>
```

---

## Rounded Corners

```html
<div class="rounded">Rounded all corners</div>
<div class="rounded-top">Rounded top</div>
<div class="rounded-end">Rounded right</div>
<div class="rounded-bottom">Rounded bottom</div>
<div class="rounded-start">Rounded left</div>
<div class="rounded-circle">Circle</div>
<div class="rounded-pill">Pill shape</div>
<div class="rounded-0">No rounding</div>
<div class="rounded-1">Small radius</div>
<div class="rounded-2">Default radius</div>
<div class="rounded-3">Large radius</div>
<div class="rounded-4">Extra large</div>
<div class="rounded-5">XXL radius</div>
```

---

## Width and Height

```html
<div class="w-25">Width 25%</div>
<div class="w-50">Width 50%</div>
<div class="w-75">Width 75%</div>
<div class="w-100">Width 100%</div>
<div class="w-auto">Auto width</div>
<div class="mw-100">Max-width 100%</div>

<div class="h-25">Height 25%</div>
<div class="h-50">Height 50%</div>
<div class="h-75">Height 75%</div>
<div class="h-100">Height 100%</div>
<div class="h-auto">Auto height</div>
<div class="mh-100">Max-height 100%</div>
```

---

## Positioning

```html
<div class="position-static">Static</div>
<div class="position-relative">Relative</div>
<div class="position-absolute">Absolute</div>
<div class="position-fixed">Fixed</div>
<div class="position-sticky">Sticky</div>
```

### Placement Utilities

```html
<div class="position-relative" style="height: 200px;">
  <div class="position-absolute top-0 start-0">Top-left</div>
  <div class="position-absolute top-0 end-0">Top-right</div>
  <div class="position-absolute bottom-0 start-0">Bottom-left</div>
  <div class="position-absolute bottom-0 end-0">Bottom-right</div>
  <div class="position-absolute top-50 start-50 translate-middle">Center</div>
</div>
```

### Translate Middle (Perfect Centering)

```html
<div class="position-absolute top-50 start-50 translate-middle">Centered</div>
```

---

## Float

```html
<div class="float-start">Float left</div>
<div class="float-end">Float right</div>
<div class="float-none">No float</div>

<!-- Responsive -->
<div class="float-sm-end">Float right on sm+</div>
<div class="float-md-end">Float right on md+</div>
```

### Clearfix

```html
<div class="clearfix">
  <div class="float-start">Left</div>
  <div class="float-end">Right</div>
</div>
```

---

## Overflow

```html
<div class="overflow-auto">Scroll if content overflows</div>
<div class="overflow-hidden">Hide overflow</div>
<div class="overflow-visible">Show overflow (default)</div>
<div class="overflow-scroll">Always show scrollbar</div>
```

---

## Text Alignment (Responsive)

```html
<p class="text-start">Left aligned</p>
<p class="text-center">Center aligned</p>
<p class="text-end">Right aligned</p>

<!-- Responsive -->
<p class="text-sm-center">Center on sm+</p>
<p class="text-md-end">Right on md+</p>
```

---

## Vertical Alignment

```html
<span class="align-baseline">baseline</span>
<span class="align-top">top</span>
<span class="align-middle">middle</span>
<span class="align-bottom">bottom</span>
<span class="align-text-top">text-top</span>
<span class="align-text-bottom">text-bottom</span>
```

---

## Other Utilities

### Aspect Ratio

```html
<div class="ratio ratio-1x1">
  <iframe src="video.mp4"></iframe>
</div>
<div class="ratio ratio-4x3">...</div>
<div class="ratio ratio-16x9">...</div>
<div class="ratio ratio-21x9">...</div>
```

### Close Icon

```html
<button type="button" class="btn-close" aria-label="Close"></button>
<button type="button" class="btn-close btn-close-white"></button> <!-- white variant -->
```

### Screen Reader Only

```html
<span class="visually-hidden">Screen readers only text</span>
```

---

## Key Points

- **Spacing** — `m`/`p` + side + size (0-5, auto); responsive variants available
- **Colors** — `.text-*`, `.bg-*`, `.text-bg-*` for auto-contrast
- **Display** — `.d-{value}` controls `display` property; responsive
- **Visibility** — `.visible`/`.invisible` hides but preserves space; `.d-none` removes flow
- **Borders** — sides, widths (1-5), colors, complete removal
- **Shadows** — `shadow-none`, `shadow-sm`, `shadow`, `shadow-lg`
- **Rounded** — sides, circle, pill, sizes (0-5)
- **Positioning** — `position-*` + `top-*`/`start-*`/`end-*`/`bottom-*` + `translate-middle`
- **Float** — `.float-*` with responsive variants; `.clearfix` parent
