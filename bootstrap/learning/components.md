# Bootstrap 5 Components

## Typography

### Headings

```html
<h1>h1 Bootstrap heading</h1>    /* 2.5rem / 40px */
<h2>h2 heading</h2>              /* 2rem / 32px */
<h3>h3 heading</h3>              /* 1.75rem / 28px */
<h4>h4 heading</h4>              /* 1.5rem / 24px */
<h5>h5 heading</h5>              /* 1.25rem / 20px */
<h6>h6 heading</h6>              /* 1rem / 16px */
```

### Display Headings

```html
<h1 class="display-1">Display 1</h1>
<h1 class="display-2">Display 2</h1>
<h1 class="display-3">Display 3</h1>
<h1 class="display-4">Display 4</h1>
<h1 class="display-5">Display 5</h1>
<h1 class="display-6">Display 6</h1>
```

### Inline Text Elements

```html
<p>You can use the mark tag to <mark>highlight</mark> text.</p>
<p><del>This line of text is meant to be treated as deleted text.</del></p>
<p><s>This line of text is meant to be treated as no longer accurate.</s></p>
<p><ins>This line of text is meant to be treated as an addition to the document.</ins></p>
<p><u>This line of text will render as underlined.</u></p>
<p><small>This line of text is meant to be treated as fine print.</small></p>
<p><strong>This line rendered as bold text.</strong></p>
<p><em>This line rendered as italicized text.</em></p>
```

### Text Utilities

```html
<p class="text-start">Left aligned</p>
<p class="text-center">Center aligned</p>
<p class="text-end">Right aligned</p>
<p class="text-nowrap">No wrap</p>
<p class="text-lowercase">Lowercased text</p>
<p class="text-uppercase">Uppercased text</p>
<p class="text-capitalize">Capitalized text</p>
<p class="text-truncate">Long text with ellipsis...</p>
```

### Lists

```html
<ul class="list-unstyled">
  <li>No bullets</li>
</ul>

<ul class="list-inline">
  <li class="list-inline-item">Inline item 1</li>
  <li class="list-inline-item">Inline item 2</li>
</ul>
```

---

## Buttons

### Button Tags

```html
<button class="btn btn-primary">Button</button>
<a class="btn btn-primary" href="#">Link</a>
<input class="btn btn-primary" type="submit" value="Submit">
```

### Button Colors

```html
<button class="btn btn-primary">Primary</button>
<button class="btn btn-secondary">Secondary</button>
<button class="btn btn-success">Success</button>
<button class="btn btn-danger">Danger</button>
<button class="btn btn-warning">Warning</button>
<button class="btn btn-info">Info</button>
<button class="btn btn-light">Light</button>
<button class="btn btn-dark">Dark</button>
<button class="btn btn-link">Link</button>
```

### Outline Buttons

```html
<button class="btn btn-outline-primary">Primary</button>
<button class="btn btn-outline-danger">Danger</button>
```

### Button Sizes

```html
<button class="btn btn-primary btn-lg">Large</button>
<button class="btn btn-primary btn-sm">Small</button>
```

### Block Buttons

```html
<button class="btn btn-primary w-100">Full width</button>
<button class="btn btn-primary d-grid gap-2">Full width</button>
```

### Disabled Buttons

```html
<button class="btn btn-primary" disabled>Disabled</button>
<a class="btn btn-primary disabled" href="#">Disabled link</a>
```

### Button Groups

```html
<div class="btn-group">
  <button class="btn btn-primary">Left</button>
  <button class="btn btn-primary">Middle</button>
  <button class="btn btn-primary">Right</button>
</div>
```

---

## Forms

### Form Controls

```html
<form>
  <div class="mb-3">
    <label for="email" class="form-label">Email</label>
    <input type="email" class="form-control" id="email" placeholder="name@example.com">
  </div>
  <div class="mb-3">
    <label for="password" class="form-label">Password</label>
    <input type="password" class="form-control" id="password">
  </div>
  <div class="mb-3">
    <label for="textarea" class="form-label">Textarea</label>
    <textarea class="form-control" id="textarea" rows="3"></textarea>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
```

### Form Sizing

```html
<input class="form-control form-control-lg" type="text">  <!-- Large -->
<input class="form-control form-control-sm" type="text">  <!-- Small -->
```

### Select Menus

```html
<select class="form-select">
  <option selected>Open this select menu</option>
  <option value="1">One</option>
  <option value="2">Two</option>
</select>

<select class="form-select form-select-lg">...</select>   <!-- Large -->
<select class="form-select form-select-sm">...</select>   <!-- Small -->
```

### Checks and Radios

```html
<div class="form-check">
  <input class="form-check-input" type="checkbox" id="check1">
  <label class="form-check-label" for="check1">Checkbox</label>
</div>

<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="radio1">
  <label class="form-check-label" for="radio1">Radio 1</label>
</div>

<!-- Toggle switch -->
<div class="form-check form-switch">
  <input class="form-check-input" type="checkbox" role="switch">
  <label class="form-check-label">Toggle switch</label>
</div>

<!-- Inline -->
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox">
  <label class="form-check-label">Inline 1</label>
</div>
```

### Input Groups

```html
<div class="input-group mb-3">
  <span class="input-group-text">@</span>
  <input type="text" class="form-control" placeholder="Username">
</div>

<div class="input-group">
  <input type="text" class="form-control">
  <button class="btn btn-primary" type="button">Search</button>
</div>
```

### Floating Labels

```html
<div class="form-floating mb-3">
  <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
  <label for="floatingInput">Email address</label>
</div>
```

### Form Validation

```html
<form class="was-validated">
  <div class="mb-3">
    <input type="text" class="form-control" required minlength="3">
    <div class="valid-feedback">Looks good!</div>
    <div class="invalid-feedback">Please enter at least 3 characters.</div>
  </div>
</form>

<!-- JavaScript validation -->
<form class="needs-validation" novalidate>
  <!-- ... -->
</form>
```

---

## Navbar

### Basic Navbar

```html
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Brand</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Features</a></li>
        <li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a></li>
      </ul>
    </div>
  </div>
</nav>
```

### Navbar Themes

```html
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">...</nav>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">...</nav>
<nav class="navbar navbar-expand-lg navbar-light bg-light">...</nav>
```

### Navbar Placement

```html
<nav class="navbar fixed-top">...</nav>   <!-- Fixed at top -->
<nav class="navbar fixed-bottom">...</nav>  <!-- Fixed at bottom -->
<nav class="navbar sticky-top">...</nav>   <!-- Sticky top -->
```

---

## Cards

### Basic Card

```html
<div class="card" style="width: 18rem;">
  <img src="img.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
```

### Card Layout Options

```html
<!-- Header and footer -->
<div class="card">
  <div class="card-header">Header</div>
  <div class="card-body">Content</div>
  <div class="card-footer text-muted">Footer</div>
</div>

<!-- Horizontal card -->
<div class="card mb-3" style="max-width: 540px;">
  <div class="row g-0">
    <div class="col-md-4">
      <img src="..." class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">Horizontal card</h5>
      </div>
    </div>
  </div>
</div>
```

### Card Groups

```html
<div class="card-group">
  <div class="card">...</div>
  <div class="card">...</div>
  <div class="card">...</div>
</div>
```

---

## Media Objects (Card-based in BS5)

Bootstrap 5 uses cards and flex utilities instead of the deprecated `.media` class:

```html
<div class="d-flex align-items-start">
  <img src="avatar.jpg" class="me-3 rounded-circle" width="64">
  <div>
    <h5 class="mt-0">Media heading</h5>
    <p>Content goes here.</p>
  </div>
</div>
```

---

## Alerts

```html
<div class="alert alert-primary">Simple alert</div>
<div class="alert alert-danger">Danger alert</div>
<div class="alert alert-warning alert-dismissible fade show">
  <strong>Warning!</strong> Check your input.
  <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
</div>
```

---

## Badges

```html
<h1>Example <span class="badge bg-primary">New</span></h1>
<button class="btn btn-primary">Notifications <span class="badge bg-danger">4</span></button>
<span class="badge bg-warning text-dark">Warning</span>
<span class="badge rounded-pill bg-primary">Pill badge</span>
```

---

## Tables

```html
<table class="table table-striped table-bordered table-hover">
  <thead class="table-dark">
    <tr>
      <th>#</th>
      <th>Name</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1</td>
      <td>Alice</td>
    </tr>
  </tbody>
</table>

<!-- Responsive table -->
<div class="table-responsive">
  <table class="table">...</table>
</div>
```

---

## List Groups

```html
<ul class="list-group">
  <li class="list-group-item active">Active item</li>
  <li class="list-group-item">Item</li>
  <li class="list-group-item disabled">Disabled</li>
</ul>

<!-- Actionable list group -->
<div class="list-group">
  <a href="#" class="list-group-item list-group-item-action">Link item</a>
</div>

<!-- Flush (no borders) -->
<ul class="list-group list-group-flush">...</ul>

<!-- Horizontal -->
<ul class="list-group list-group-horizontal">...</ul>
```

---

## Key Points

- **Typography** — headings, display, utilities, lists
- **Buttons** — colors, outlines, sizes, groups, block, disabled
- **Forms** — controls, selects, checks, radios, switches, input groups, floating labels, validation
- **Navbar** — responsive with toggler, dark/light themes, fixed/sticky
- **Cards** — flexible content containers with header/body/footer, groups, horizontal layouts
- **Media** — use flex utilities (`d-flex`) instead of obsolete `.media` class
- **Alerts** — dismissible with close button
- **Badges** — inline or pill-shaped, scale to parent font size
- **Tables** — striped, bordered, hover, responsive wrapper
- **List groups** — basic, actionable, flush, horizontal
