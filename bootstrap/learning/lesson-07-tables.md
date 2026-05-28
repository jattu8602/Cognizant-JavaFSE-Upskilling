# Lesson 7: Tables

## Basic Table

```html
<table class="table">
  <thead>
    <tr>
      <th>#</th>
      <th>Name</th>
      <th>Email</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1</td>
      <td>Alice</td>
      <td>alice@email.com</td>
    </tr>
    <tr>
      <td>2</td>
      <td>Bob</td>
      <td>bob@email.com</td>
    </tr>
  </tbody>
</table>
```

## Table Variants

```html
<table class="table table-striped">    <!-- Alternating row colors -->
<table class="table table-bordered">   <!-- Borders on all cells -->
<table class="table table-hover">      <!-- Hover effect on rows -->
<table class="table table-borderless"> <!-- No borders -->
<table class="table table-sm">         <!-- Compact (half padding) -->
```

## Dark Table

```html
<table class="table table-dark">
<table class="table table-dark table-striped">
```

## Contextual Rows

```html
<tr class="table-primary">...</tr>   <!-- Blue -->
<tr class="table-success">...</tr>   <!-- Green -->
<tr class="table-danger">...</tr>    <!-- Red -->
<tr class="table-warning">...</tr>   <!-- Yellow -->
<tr class="table-info">...</tr>      <!-- Light blue -->
<tr class="table-active">...</tr>    <!-- Highlight -->
```

## Responsive Tables

```html
<div class="table-responsive">
  <table class="table">...</table>
</div>

<!-- Specific breakpoint -->
<div class="table-responsive-lg">  <!-- Scroll only below lg -->
  <table class="table">...</table>
</div>
```

---

## Interview Questions

**Q: How do you create a striped table in Bootstrap?**
A: Add `.table-striped` to the `<table>`. It applies `nth-child(even)` background to table rows.

**Q: What does `.table-responsive` do and why is it important?**
A: It wraps the table in a container with `overflow-x: auto`, allowing horizontal scrolling on small screens. Important for tables with many columns that would otherwise break mobile layouts.

**Q: How do you make a compact table with less padding?**
A: Add `.table-sm` to the `<table>` class. It halves the cell padding.
