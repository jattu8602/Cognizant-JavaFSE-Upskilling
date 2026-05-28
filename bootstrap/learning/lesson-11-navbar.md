# Lesson 11: Navbar

The navbar is a responsive navigation component with built-in collapse for mobile.

## Basic Navbar

```html
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Brand</a>
    <button class="navbar-toggler" type="button"
            data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#">Disabled</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
```

## Themes

```html
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">...</nav>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">...</nav>
<nav class="navbar navbar-expand-lg navbar-light bg-light">...</nav>
```

- `navbar-dark` — for use with dark backgrounds (white text)
- `navbar-light` — for use with light backgrounds (dark text)

## Placement

```html
<nav class="navbar fixed-top">...</nav>      <!-- Always at top -->
<nav class="navbar fixed-bottom">...</nav>   <!-- Always at bottom -->
<nav class="navbar sticky-top">...</nav>     <!-- Sticks on scroll -->
```

## Brand

```html
<!-- Text brand -->
<a class="navbar-brand" href="#">Brand</a>

<!-- Image brand -->
<a class="navbar-brand" href="#">
  <img src="logo.png" alt="Logo" height="30">
</a>
```

## Navbar with Form

```html
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand">Brand</a>
    <form class="d-flex" role="search">
      <input class="form-control me-2" type="search" placeholder="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
</nav>
```

## Navbar with Dropdown

```html
<ul class="navbar-nav">
  <li class="nav-item dropdown">
    <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown">
      Dropdown
    </a>
    <ul class="dropdown-menu">
      <li><a class="dropdown-item" href="#">Action</a></li>
      <li><a class="dropdown-item" href="#">Another</a></li>
      <li><hr class="dropdown-divider"></li>
      <li><a class="dropdown-item" href="#">Separated</a></li>
    </ul>
  </li>
</ul>
```

---

## Interview Questions

**Q: What does `navbar-expand-lg` do?**
A: It sets the breakpoint where the navbar expands horizontally. Below lg (992px), the navbar collapses into a hamburger menu. Above lg, links are displayed horizontally.

**Q: What is the purpose of `navbar-toggler` and `navbar-collapse`?**
A: The toggler is the hamburger button visible on mobile. Clicking it toggles the collapse of `navbar-collapse`, which contains the navigation links. The `data-bs-target` attribute links the button to the collapse element.

**Q: What is the difference between `navbar-dark` and `navbar-light`?**
A: `navbar-dark` styles the text and links in white (for dark bg). `navbar-light` styles them in dark (for light bg). Use with corresponding `bg-dark` or `bg-light` classes.

**Q: How do you make a navbar fixed at the top of the page?**
A: Add `.fixed-top` class to the `<nav>`. This applies `position: fixed; top: 0; width: 100%`.
