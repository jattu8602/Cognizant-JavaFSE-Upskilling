# Bootstrap 5 - Advanced Features

## Bootstrap Icons

Bootstrap Icons is an open-source icon library designed for Bootstrap components.

### Setup

```html
<!-- CDN (Option 1) -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<!-- npm (Option 2) -->
npm install bootstrap-icons
```

### Usage

```html
<i class="bi bi-alarm"></i>
<i class="bi bi-heart-fill"></i>
<i class="bi bi-star"></i>
<i class="bi bi-person-circle"></i>
<i class="bi bi-gear"></i>
```

### Sizing

```html
<i class="bi bi-circle fs-1"></i>    <!-- Largest -->
<i class="bi bi-circle fs-2"></i>
<i class="bi bi-circle fs-3"></i>
<i class="bi bi-circle fs-4"></i>
<i class="bi bi-circle fs-5"></i>
<i class="bi bi-circle fs-6"></i>    <!-- Default -->
```

### Styling

```html
<i class="bi bi-trash text-danger"></i>
<i class="bi bi-check-circle text-success"></i>
<i class="bi bi-info-circle text-primary"></i>
```

### Common Icons

```html
<!-- Actions -->
<i class="bi bi-plus-circle"></i>     <!-- Add -->
<i class="bi bi-pencil"></i>          <!-- Edit -->
<i class="bi bi-trash"></i>           <!-- Delete -->
<i class="bi bi-search"></i>          <!-- Search -->
<i class="bi bi-download"></i>        <!-- Download -->

<!-- Navigation -->
<i class="bi bi-house"></i>           <!-- Home -->
<i class="bi bi-person"></i>          <!-- User -->
<i class="bi bi-envelope"></i>        <!-- Mail -->
<i class="bi bi-bell"></i>            <!-- Notifications -->

<!-- Status -->
<i class="bi bi-check-circle"></i>    <!-- Success -->
<i class="bi bi-exclamation-triangle"></i>  <!-- Warning -->
<i class="bi bi-x-circle"></i>        <!-- Error -->
<i class="bi bi-info-circle"></i>     <!-- Info -->

<!-- Social -->
<i class="bi bi-github"></i>
<i class="bi bi-twitter-x"></i>
<i class="bi bi-linkedin"></i>
<i class="bi bi-facebook"></i>
```

---

## JavaScript Plugins

Bootstrap 5 uses **vanilla JavaScript** (no jQuery). Include `bootstrap.bundle.min.js` which includes Popper.js for tooltips/popovers.

### Modal

```html
<!-- Button trigger -->
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal">
  Open Modal
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>
      <div class="modal-body">Modal content goes here.</div>
      <div class="modal-footer">
        <button class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
```

#### Modal Sizes

```html
<div class="modal-dialog modal-sm">...</div>   <!-- Small -->
<div class="modal-dialog">...</div>            <!-- Default -->
<div class="modal-dialog modal-lg">...</div>   <!-- Large -->
<div class="modal-dialog modal-xl">...</div>   <!-- Extra large -->
<div class="modal-dialog modal-fullscreen">...</div>  <!-- Full screen -->
```

#### Modal via JavaScript

```javascript
const myModal = new bootstrap.Modal(document.getElementById('myModal'));
myModal.show();
myModal.hide();
myModal.toggle();
```

### Dropdowns

```html
<div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
    Dropdown button
  </button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="#">Action</a></li>
    <li><a class="dropdown-item" href="#">Another action</a></li>
    <li><hr class="dropdown-divider"></li>
    <li><a class="dropdown-item" href="#">Separated action</a></li>
  </ul>
</div>
```

#### Dropdown Directions

```html
<div class="dropup">...</div>     <!-- Dropup -->
<div class="dropend">...</div>    <!-- Right -->
<div class="dropstart">...</div>  <!-- Left -->
```

### Carousel

```html
<div id="carouselExample" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img1.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="img2.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="img3.jpg" class="d-block w-100" alt="...">
    </div>
  </div>
  <!-- Controls -->
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
    <span class="carousel-control-next-icon"></span>
  </button>
  <!-- Indicators -->
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="0" class="active"></button>
    <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="1"></button>
    <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="2"></button>
  </div>
</div>
```

### Navs & Tabs

```html
<!-- Tabs -->
<ul class="nav nav-tabs" id="myTab">
  <li class="nav-item">
    <a class="nav-link active" data-bs-toggle="tab" href="#home">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" data-bs-toggle="tab" href="#profile">Profile</a>
  </li>
</ul>
<div class="tab-content">
  <div class="tab-pane fade show active" id="home">Home content</div>
  <div class="tab-pane fade" id="profile">Profile content</div>
</div>

<!-- Pills -->
<ul class="nav nav-pills">
  <li class="nav-item">
    <a class="nav-link active" data-bs-toggle="pill" href="#home">Home</a>
  </li>
</ul>
```

### Collapse / Accordion

```html
<!-- Collapse -->
<button data-bs-toggle="collapse" data-bs-target="#content">Toggle</button>
<div class="collapse" id="content">Hidden content</div>

<!-- Accordion -->
<div class="accordion" id="accordionExample">
  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button" data-bs-toggle="collapse" data-bs-target="#collapseOne">
        Accordion Item #1
      </button>
    </h2>
    <div id="collapseOne" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
      <div class="accordion-body">Content 1</div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button collapsed" data-bs-toggle="collapse" data-bs-target="#collapseTwo">
        Accordion Item #2
      </button>
    </h2>
    <div id="collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
      <div class="accordion-body">Content 2</div>
    </div>
  </div>
</div>
```

### Tooltips

```html
<button type="button" class="btn btn-secondary" data-bs-toggle="tooltip" title="Tooltip text">
  Hover me
</button>

<!-- Must initialize via JavaScript -->
<script>
  const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]');
  const tooltipList = [...tooltipTriggerList].map(el => new bootstrap.Tooltip(el));
</script>
```

### Popovers

```html
<button type="button" class="btn btn-danger" data-bs-toggle="popover" title="Popover title"
  data-bs-content="Popover content here.">
  Click to toggle popover
</button>

<script>
  const popoverTriggerList = document.querySelectorAll('[data-bs-toggle="popover"]');
  const popoverList = [...popoverTriggerList].map(el => new bootstrap.Popover(el));
</script>
```

### Toast

```html
<div class="toast" role="alert" aria-live="assertive" aria-atomic="true">
  <div class="toast-header">
    <strong class="me-auto">Notification</strong>
    <button type="button" class="btn-close" data-bs-dismiss="toast"></button>
  </div>
  <div class="toast-body">Hello, world! This is a toast message.</div>
</div>

<button onclick="showToast()">Show Toast</button>
<script>
  function showToast() {
    const toast = new bootstrap.Toast(document.querySelector('.toast'));
    toast.show();
  }
</script>
```

### Offcanvas

```html
<button data-bs-toggle="offcanvas" data-bs-target="#offcanvasExample">Toggle Offcanvas</button>

<div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasExample">
  <div class="offcanvas-header">
    <h5 class="offcanvas-title">Offcanvas</h5>
    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
  </div>
  <div class="offcanvas-body">Content</div>
</div>
```

### Scrollspy

Auto-updates nav based on scroll position:

```html
<body data-bs-spy="scroll" data-bs-target="#navbar-example">
  <nav id="navbar-example" class="navbar navbar-light bg-light">
    <ul class="nav nav-pills">
      <li class="nav-item"><a class="nav-link" href="#section1">Section 1</a></li>
      <li class="nav-item"><a class="nav-link" href="#section2">Section 2</a></li>
    </ul>
  </nav>
  <div id="section1">...</div>
  <div id="section2">...</div>
</body>
```

---

## Customization with Sass

Bootstrap is built with Sass, making it highly customizable.

### Project Setup

```bash
npm install bootstrap
```

### Import Bootstrap Source

Create a `custom.scss` file:

```scss
// 1. Override Bootstrap variables BEFORE importing
$primary: #ff5733;
$danger: #ff4136;
$border-radius: 0.25rem;
$font-family-sans-serif: "Roboto", sans-serif;

// 2. Import Bootstrap
@import "../node_modules/bootstrap/scss/bootstrap";
```

### Compile

```bash
npm install sass
npx sass custom.scss custom.css
```

### Common Variables to Override

```scss
// Colors
$primary:   #007bff;
$secondary: #6c757d;
$success:   #28a745;
$danger:    #dc3545;
$warning:   #ffc107;
$info:      #17a2b8;

// Typography
$font-size-base: 1rem;
$font-family-sans-serif: system-ui, -apple-system, sans-serif;
$headings-font-weight: 700;

// Spacing
$spacer: 1rem;

// Grid
$grid-columns: 12;
$grid-gutter-width: 1.5rem;

// Border radius
$border-radius: 0.375rem;
$border-radius-lg: 0.5rem;
$border-radius-sm: 0.25rem;

// Breakpoints
$grid-breakpoints: (
  xs: 0,
  sm: 576px,
  md: 768px,
  lg: 992px,
  xl: 1200px,
  xxl: 1400px
);
```

### Custom Theme Example

```scss
// File: custom-bootstrap.scss
$primary: #6f42c1;        // Purple theme
$enable-shadows: true;
$enable-gradients: true;

@import "bootstrap/scss/bootstrap";
```

### Using Maps

```scss
// Add custom colors
$custom-colors: (
  "custom-color": #900
);
$theme-colors: map-merge($theme-colors, $custom-colors);

// Now use: class="btn btn-custom-color"
```

### Utility API

Bootstrap 5's utility API lets you generate custom utility classes:

```scss
@import "bootstrap/scss/functions";
@import "bootstrap/scss/variables";
@import "bootstrap/scss/utilities";

$utilities: map-merge(
  $utilities,
  (
    "opacity": (
      property: opacity,
      class: opacity,
      values: (
        0: 0,
        25: .25,
        50: .5,
        75: .75,
        100: 1,
      )
    )
  )
);

@import "bootstrap/scss/bootstrap";
```

---

## Dark Mode (Bootstrap 5.3+)

```html
<!-- Enable via data attribute -->
<html data-bs-theme="dark">
<!-- or -->
<html data-bs-theme="light">

<!-- Toggle with JavaScript -->
<button onclick="toggleTheme()">Toggle Theme</button>
<script>
function toggleTheme() {
  const html = document.querySelector('html');
  const current = html.getAttribute('data-bs-theme');
  html.setAttribute('data-bs-theme', current === 'dark' ? 'light' : 'dark');
}
</script>
```

---

## Key Points

- **Bootstrap Icons** — free icon library; use `<i class="bi bi-*">`
- **JavaScript plugins** — use `data-bs-*` attributes for most behavior; initialize tooltips/popovers with JS
- **Modal** — `.modal`, [`data-bs-toggle="modal"`], [`data-bs-target="#id"`]
- **Carousel** — `.carousel`, `.carousel-item`, controls, indicators
- **Dropdown** — `.dropdown`, `.dropdown-menu`, `.dropdown-item`
- **Collapse/Accordion** — `data-bs-toggle="collapse"`, `.accordion`, `.accordion-collapse`
- **Tooltips/Popovers** — require manual JS initialization
- **Offcanvas** — sidebar-like panels (start, end, top, bottom)
- **Sass** — override variables before importing bootstrap source; compile with `sass`
- **Dark mode** — add `data-bs-theme="dark"` to `<html>`
- No jQuery needed — all JS is vanilla
