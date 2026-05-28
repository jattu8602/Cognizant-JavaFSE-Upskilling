# Lesson 12: Cards

Cards are flexible content containers with optional header, body, and footer.

## Basic Card

```html
<div class="card" style="width: 18rem;">
  <img src="photo.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
```

## Card Parts

```html
<div class="card">
  <div class="card-header">Header</div>
  <div class="card-body">
    <h5 class="card-title">Title</h5>
    <h6 class="card-subtitle mb-2 text-muted">Subtitle</h6>
    <p class="card-text">Body content</p>
    <a href="#" class="card-link">Link 1</a>
    <a href="#" class="card-link">Link 2</a>
  </div>
  <div class="card-footer text-muted">Footer</div>
</div>
```

## Horizontal Card

```html
<div class="card mb-3" style="max-width: 540px;">
  <div class="row g-0">
    <div class="col-md-4">
      <img src="photo.jpg" class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">Horizontal card</h5>
        <p class="card-text">Content side by side with image.</p>
      </div>
    </div>
  </div>
</div>
```

## Card Groups

```html
<div class="card-group">
  <div class="card">
    <div class="card-body">Card 1</div>
  </div>
  <div class="card">
    <div class="card-body">Card 2</div>
  </div>
  <div class="card">
    <div class="card-body">Card 3</div>
  </div>
</div>
```

## Card Grid (with Bootstrap columns)

```html
<div class="row row-cols-1 row-cols-md-3 g-4">
  <div class="col">
    <div class="card">...</div>
  </div>
  <div class="col">
    <div class="card">...</div>
  </div>
  <div class="col">
    <div class="card">...</div>
  </div>
</div>
```

## Card Styles

```html
<div class="card text-white bg-primary">...</div>
<div class="card text-white bg-dark">...</div>
<div class="card border-danger">...</div>
<div class="card text-center">...</div>
```

## Card Image Overlay

```html
<div class="card text-white">
  <img src="photo.jpg" class="card-img" alt="...">
  <div class="card-img-overlay">
    <h5 class="card-title">Title on image</h5>
    <p class="card-text">Text overlays the image.</p>
  </div>
</div>
```

---

## Interview Questions

**Q: What components make up a Bootstrap card?**
A: `.card` (wrapper), `.card-header`, `.card-body` (with `.card-title`, `.card-subtitle`, `.card-text`), `.card-footer`, `.card-img-top`, `.card-img-overlay`, `.card-link`.

**Q: How do you create equal-height cards in a row?**
A: Use `.card-group` for equal-height cards with no gaps between them. For equal-height with gaps, use Bootstrap's grid with `.row-cols-*`.

**Q: How do you overlay text on a card image?**
A: Use `.card-img` (not `card-img-top`) for the image, then wrap text in `.card-img-overlay`. The overlay positions text on top of the image using absolute positioning.

**Q: How do you create a horizontal card layout?**
A: Use a nested grid inside the card: `.row.g-0` > `.col-md-*` for image + `.col-md-*` for body. This places image and content side-by-side.
