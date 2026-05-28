# Lesson 14: Components (Alerts, Badges, List Groups, Accordion, Modal)

## Alerts

```html
<div class="alert alert-primary">Primary alert</div>
<div class="alert alert-success">Success!</div>
<div class="alert alert-danger">Error occurred</div>
<div class="alert alert-warning">Warning</div>

<!-- Dismissible -->
<div class="alert alert-danger alert-dismissible fade show">
  <strong>Error!</strong> Something went wrong.
  <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
</div>

<!-- With link -->
<div class="alert alert-info">
  Learn more at <a href="#" class="alert-link">this page</a>.
</div>
```

## Badges

```html
<h1>Heading <span class="badge bg-primary">New</span></h1>
<button class="btn btn-primary">
  Notifications <span class="badge bg-danger">4</span>
</button>
<span class="badge bg-success">Success</span>
<span class="badge rounded-pill bg-primary">Pill badge</span>
<span class="badge bg-warning text-dark">Warning</span>
```

## List Groups

```html
<ul class="list-group">
  <li class="list-group-item">Item 1</li>
  <li class="list-group-item active">Item 2 (active)</li>
  <li class="list-group-item disabled">Item 3 (disabled)</li>
</ul>

<!-- Actionable -->
<div class="list-group">
  <a href="#" class="list-group-item list-group-item-action">Link</a>
  <button class="list-group-item list-group-item-action">Button</button>
</div>

<!-- Flush (no borders) -->
<ul class="list-group list-group-flush">...</ul>

<!-- Horizontal -->
<ul class="list-group list-group-horizontal">...</ul>
```

## Accordion

```html
<div class="accordion" id="accordionExample">
  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button" data-bs-toggle="collapse" data-bs-target="#collapseOne">
        Item #1
      </button>
    </h2>
    <div id="collapseOne" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
      <div class="accordion-body">Content 1</div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button collapsed" data-bs-toggle="collapse" data-bs-target="#collapseTwo">
        Item #2
      </button>
    </h2>
    <div id="collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
      <div class="accordion-body">Content 2</div>
    </div>
  </div>
</div>
```

## Modal

```html
<!-- Button -->
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal">
  Open Modal
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>
      <div class="modal-body">Content</div>
      <div class="modal-footer">
        <button class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button class="btn btn-primary">Save</button>
      </div>
    </div>
  </div>
</div>
```

### Modal Sizes

```html
<div class="modal-dialog modal-sm">...</div>
<div class="modal-dialog modal-lg">...</div>
<div class="modal-dialog modal-xl">...</div>
<div class="modal-dialog modal-fullscreen">...</div>
```

---

## Interview Questions

**Q: How do you make an alert dismissible?**
A: Add classes `alert-dismissible fade show` and a close button with `data-bs-dismiss="alert"`. The `fade show` provides the animation.

**Q: What is the difference between `badge bg-primary` and `badge bg-primary rounded-pill`?**
A: Both add the badge styling. `rounded-pill` makes the badge have fully rounded ends (pill/capsule shape) instead of slightly rounded corners.

**Q: How does the accordion ensure only one panel is open at a time?**
A: The `data-bs-parent="#accordionExample"` attribute on each collapse element links them. When one opens, Bootstrap closes all others under the same parent.

**Q: What HTML structure is required for a modal?**
A: `.modal` > `.modal-dialog` > `.modal-content` > (`.modal-header` + `.modal-body` + `.modal-footer`). The modal is triggered by a button with `data-bs-toggle="modal"` and `data-bs-target="#modalID"`.
