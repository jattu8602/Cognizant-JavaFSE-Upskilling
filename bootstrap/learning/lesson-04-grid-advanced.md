# Lesson 4: Grid System Advanced

## Offsets

Shift columns right using `.offset-{breakpoint}-{size}`:

```html
<div class="row">
  <div class="col-4">Left</div>
  <div class="col-4 offset-4">Right (offset by 4)</div>
</div>

<div class="row">
  <div class="col-3 offset-3">3 offset 3</div>
  <div class="col-3 offset-3">3 offset 3</div>
</div>
```

## Column Ordering

Use `.order-{breakpoint}-{number}` to reorder:

```html
<div class="row">
  <div class="col order-3">Third in display</div>
  <div class="col order-1">First in display</div>
  <div class="col order-2">Second in display</div>
</div>
```

Special: `.order-first` (order: -1), `.order-last` (order: 6)

## Nesting

Rows inside columns:

```html
<div class="row">
  <div class="col-6">
    <div class="row">
      <div class="col-4">Nested 1</div>
      <div class="col-8">Nested 2</div>
    </div>
  </div>
  <div class="col-6">Outer column</div>
</div>
```

## Gutters

Control spacing between columns:

```html
<div class="row g-0">    <!-- No gutters -->
<div class="row g-2">    <!-- 0.5rem -->
<div class="row g-4">    <!-- 1.5rem -->
<div class="row g-5">    <!-- 3rem -->

<!-- Horizontal or vertical only -->
<div class="row gx-4">   <!-- Horizontal gutters -->
<div class="row gy-4">   <!-- Vertical gutters -->
```

## Row Columns

Set column count at the row level:

```html
<div class="row row-cols-3">
  <div class="col">1</div>
  <div class="col">2</div>
  <div class="col">3</div>
  <div class="col">4</div>
  <div class="col">5</div>
  <div class="col">6</div>
</div>
<!-- Results in 2 rows of 3 columns each -->

<div class="row row-cols-2 row-cols-md-4">
  <!-- 2 cols on xs, 4 on md+ -->
</div>
```

---

## Interview Questions

**Q: How do you center a column in Bootstrap?**
A: Use `.offset-*` to push it right. For a `col-4`, use `offset-4` to center it (4+4+4=12). Or use `mx-auto` on the column.

**Q: How do you reorder columns in Bootstrap without changing HTML order?**
A: Use `.order-*` classes. Example: `.order-3` puts it after `.order-2` regardless of DOM position.

**Q: What is the difference between `g-4` and `gx-4`?**
A: `g-4` applies gutters both horizontally and vertically. `gx-4` applies gutters only horizontally (x-axis). `gy-4` applies only vertically (y-axis).

**Q: What does `.row-cols-3` do?**
A: It tells Bootstrap to create 3 equal-width columns per row automatically, without needing to specify `.col-4` on each child. Useful for dynamic content where the number of items is unknown.
