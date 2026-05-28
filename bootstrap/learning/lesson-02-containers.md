# Lesson 2: Containers

Containers are the most basic layout element in Bootstrap. They **wrap content** and **provide responsive widths**.

## Container Types

### .container (Responsive Fixed Width)

```html
<div class="container">
  <!-- Content here has max-width at each breakpoint -->
</div>
```

- xs: 100%
- sm: 540px
- md: 720px
- lg: 960px
- xl: 1140px
- xxl: 1320px
- Auto-centered with `margin: auto`

### .container-fluid (Full Width)

```html
<div class="container-fluid">
  <!-- Always width: 100% -->
</div>
```

### .container-{breakpoint} (Responsive)

```html
<div class="container-sm">   <!-- 100% until sm breakpoint -->
<div class="container-md">   <!-- 100% until md breakpoint -->
<div class="container-lg">   <!-- 100% until lg breakpoint -->
<div class="container-xl">   <!-- 100% until xl breakpoint -->
<div class="container-xxl">  <!-- 100% until xxl breakpoint -->
```

## Example

```html
<div class="container p-3 my-3 bg-primary text-white">
  Fixed width container (resize browser to see changes)
</div>
<div class="container-fluid p-3 my-3 bg-danger text-white">
  Full width container (always spans entire viewport)
</div>
```

---

## Interview Questions

**Q: What is the difference between `.container` and `.container-fluid`?**
A: `.container` has fixed max-widths at each breakpoint (e.g. 960px at lg). `.container-fluid` always spans `width: 100%` regardless of viewport size.

**Q: When would you use `.container-md`?**
A: When you want full-width behavior on small screens (xs, sm) and fixed-width behavior starting at the md breakpoint (>=768px). Useful for mobile-first layouts.

**Q: Do containers have padding?**
A: Yes, containers have `padding-left` and `padding-right` of 0.75rem by default. This prevents content from touching the viewport edges.
