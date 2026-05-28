# Lesson 15: Carousel and Dropdowns

## Carousel

A slideshow component for cycling through images or content slides.

```html
<div id="carouselExample" class="carousel slide" data-bs-ride="carousel">

  <!-- Indicators (dots) -->
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="0" class="active"></button>
    <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="1"></button>
    <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="2"></button>
  </div>

  <!-- Slides -->
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

  <!-- Controls (arrows) -->
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
    <span class="carousel-control-next-icon"></span>
  </button>
</div>
```

### Carousel with Captions

```html
<div class="carousel-item">
  <img src="..." class="d-block w-100" alt="...">
  <div class="carousel-caption d-none d-md-block">
    <h5>Slide title</h5>
    <p>Description text.</p>
  </div>
</div>
```

### Carousel Options

```html
<div class="carousel slide" data-bs-ride="carousel">          <!-- Auto play -->
<div class="carousel slide" data-bs-interval="5000">         <!-- 5 seconds per slide -->
<div class="carousel slide" data-bs-pause="false">           <!-- No pause on hover -->
<div class="carousel slide" data-bs-wrap="false">            <!-- No wrap -->
```

### Crossfade

```html
<div class="carousel slide carousel-fade">...</div>
```

---

## Dropdowns

```html
<div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
    Dropdown button
  </button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="#">Action</a></li>
    <li><a class="dropdown-item" href="#">Another action</a></li>
    <li><hr class="dropdown-divider"></li>
    <li><a class="dropdown-item" href="#">Separated link</a></li>
  </ul>
</div>
```

### Dropdown Directions

```html
<div class="dropup">     <!-- Opens upward -->
<div class="dropend">    <!-- Opens right -->
<div class="dropstart">  <!-- Opens left -->
```

### Dropdown Items

```html
<ul class="dropdown-menu">
  <li><h6 class="dropdown-header">Header</h6></li>
  <li><a class="dropdown-item" href="#">Normal item</a></li>
  <li><a class="dropdown-item active" href="#">Active item</a></li>
  <li><a class="dropdown-item disabled" href="#">Disabled item</a></li>
  <li><hr class="dropdown-divider"></li>
  <li><button class="dropdown-item" type="button">Button item</button></li>
</ul>
```

---

## Interview Questions

**Q: What components make up a Bootstrap carousel?**
A: `.carousel` (wrapper), `.carousel-inner`, `.carousel-item` (slides), `.carousel-indicators` (dots), `.carousel-control-prev/next` (arrows), `.carousel-caption` (text overlay).

**Q: How do you make a carousel auto-play?**
A: Add `data-bs-ride="carousel"` to the `.carousel` element. You can control interval with `data-bs-interval` (milliseconds, default 5000).

**Q: What does `data-bs-slide-to="0"` do in indicators?**
A: It tells the carousel to navigate to the slide at index 0 (first slide) when clicked. Combined with `data-bs-target="#carouselId"`.

**Q: How do you create a dropdown that opens upward?**
A: Wrap the dropdown in `<div class="dropup">` instead of `<div class="dropdown">`. The menu will appear above the button.
