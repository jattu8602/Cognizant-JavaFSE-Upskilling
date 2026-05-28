# Lesson 13: Utilities

Utility classes let you style elements without custom CSS.

## Spacing

Format: `{property}{sides}-{size}`

**Property:** `m` (margin), `p` (padding)
**Sides:** `t` (top), `b` (bottom), `s` (left), `e` (right), `x` (left+right), `y` (top+bottom), blank (all)
**Sizes:** `0` (0), `1` (0.25rem), `2` (0.5rem), `3` (1rem), `4` (1.5rem), `5` (3rem), `auto`

```html
<div class="mt-3">Margin top (1rem)</div>
<div class="mx-auto">Center horizontally</div>
<div class="py-4">Padding top+bottom (1.5rem)</div>
<div class="p-5">Padding all sides (3rem)</div>
<div class="mb-0">Margin bottom 0</div>

<!-- Responsive -->
<div class="mt-3 mt-md-5">Changes at md breakpoint</div>
```

## Borders

```html
<div class="border">All borders</div>
<div class="border-top">Top only</div>
<div class="border border-0">No borders</div>
<div class="border border-3">Thicker border</div>
<div class="border border-primary">Primary color border</div>
<div class="border border-danger border-5">Thick red border</div>
```

## Shadows

```html
<div class="shadow-none">No shadow</div>
<div class="shadow-sm">Small shadow</div>
<div class="shadow">Default shadow</div>
<div class="shadow-lg">Large shadow</div>
```

## Rounded Corners

```html
<div class="rounded">Rounded</div>
<div class="rounded-circle">Circle</div>
<div class="rounded-pill">Pill shape</div>
<div class="rounded-0">No rounding</div>
<div class="rounded-3">Large radius</div>
<div class="rounded-top">Top only</div>
```

## Display

```html
<div class="d-block">Block</div>
<div class="d-inline">Inline</div>
<div class="d-flex">Flex</div>
<div class="d-none">Hidden</div>
<div class="d-md-none">Hidden on md+</div>
<div class="d-none d-md-block">Hidden on xs, visible on md+</div>
```

## Width and Height

```html
<div class="w-25">Width 25%</div>
<div class="w-50">Width 50%</div>
<div class="w-75">Width 75%</div>
<div class="w-100">Width 100%</div>
<div class="mw-100">Max width 100%</div>

<div class="h-25">Height 25%</div>
<div class="h-50">Height 50%</div>
<div class="h-100">Height 100%</div>
```

## Visibility

```html
<div class="visible">Visible (takes space)</div>
<div class="invisible">Invisible (still takes space)</div>
```

## Positioning

```html
<div class="position-relative" style="height: 200px;">
  <div class="position-absolute top-0 start-0">Top left</div>
  <div class="position-absolute top-0 end-0">Top right</div>
  <div class="position-absolute bottom-0 start-0">Bottom left</div>
  <div class="position-absolute top-50 start-50 translate-middle">Center</div>
</div>
```

---

## Interview Questions

**Q: What is the spacing scale in Bootstrap?**
A: 0-5 scale where each unit = 0.25rem × n. So 1=0.25rem, 2=0.5rem, 3=1rem, 4=1.5rem, 5=3rem. Plus `auto` for margins.

**Q: What is the difference between `d-none` and `invisible`?**
A: `d-none` removes the element from the document flow entirely (`display: none`). `invisible` hides it visually but it still occupies space (`visibility: hidden`).

**Q: How do you center an element horizontally with utilities?**
A: Use `mx-auto` for block elements with a defined width, or `text-center` for inline content. For flex containers, use `justify-content-center`.

**Q: How do you hide an element on mobile but show on desktop?**
A: Use responsive display: `class="d-none d-md-block"` hides on xs/sm, shows on md+.
