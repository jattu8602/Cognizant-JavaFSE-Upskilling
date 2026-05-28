/* ===================================================================
   Local Community Event Portal — main.js
   Exercises: 1-14 (JavaScript)
   =================================================================== */

// ===================================================================
// Exercise 1: JavaScript Basics & Setup
// ===================================================================
console.log("Welcome to the Community Portal");
window.addEventListener('load', function() {
  alert("Community Portal loaded successfully!");
  document.getElementById('statusBar').textContent = 'Portal ready.';
});

// ===================================================================
// Exercise 2: Syntax, Data Types, and Operators
// ===================================================================
const eventName = "Tech Innovators Meetup";
const eventDate = "2025-06-10";
let availableSeats = 15;

console.log(`Event: ${eventName} on ${eventDate} — Seats: ${availableSeats}`);

function registerSeat() {
  if (availableSeats > 0) {
    availableSeats--;
    console.log(`Seat registered! Remaining: ${availableSeats}`);
  } else {
    console.log('No seats available.');
  }
}

// ===================================================================
// Exercise 3: Conditionals, Loops, and Error Handling
// ===================================================================
const events = [
  { id: 1, title: "Tech Innovators Meetup", date: "2025-06-10", category: "tech", seats: 15, location: "New York" },
  { id: 2, title: "AI & ML Conference", date: "2025-05-15", category: "tech", seats: 0, location: "Chicago" },
  { id: 3, title: "Frontend Development Bootcamp", date: "2025-07-01", category: "tech", seats: 20, location: "Los Angeles" },
  { id: 4, title: "Jazz Night", date: "2025-06-20", category: "music", seats: 10, location: "New York" },
  { id: 5, title: "Watercolor Workshop", date: "2025-05-30", category: "art", seats: 5, location: "Chicago" }
];

function displayEvents(list) {
  const container = document.getElementById('eventContainer');
  container.innerHTML = '';
  list.forEach(function(event) {
    if (event.seats > 0 && new Date(event.date) > new Date()) {
      const card = document.createElement('div');
      card.className = 'event-card';
      card.innerHTML = '<h3>' + event.title + '</h3>' +
        '<p class="date">' + event.date + ' — ' + event.location + '</p>' +
        '<p class="seats">' + event.seats + ' seats available</p>' +
        '<button onclick="registerForEvent(' + event.id + ')">Register</button>';
      container.appendChild(card);
    }
  });
}

// Exercise 3: try-catch for registration
function registerForEvent(eventId) {
  try {
    if (!eventId) throw new Error('Invalid event ID');
    const evt = events.find(function(e) { return e.id === eventId; });
    if (!evt) throw new Error('Event not found');
    if (evt.seats <= 0) throw new Error('Event is full');
    evt.seats--;
    registerSeat();
    displayEvents(events);
    console.log('Registered for event:', evt.title);
  } catch (err) {
    console.error('Registration error:', err.message);
    alert('Registration failed: ' + err.message);
  }
}

// ===================================================================
// Exercise 4: Functions, Scope, Closures, Higher-Order Functions
// ===================================================================
function addEvent(title, date, category, seats, location) {
  const newId = events.length > 0 ? events[events.length - 1].id + 1 : 1;
  events.push({ id: newId, title: title, date: date, category: category, seats: seats, location: location });
  displayEvents(events);
  console.log('Event added:', title);
}

function filterEventsByCategory(category) {
  if (category === 'all') return events;
  return events.filter(function(e) { return e.category === category; });
}

function trackRegistrations() {
  var count = 0;
  return function() {
    count++;
    return count;
  };
}
var techRegistrations = trackRegistrations();

// Callback-based filter
function dynamicSearch(query, callback) {
  var results = events.filter(function(e) { return e.title.toLowerCase().includes(query.toLowerCase()); });
  callback(results);
}

// ===================================================================
// Exercise 5: Objects and Prototypes
// ===================================================================
function EventConstructor(id, title, date, category, seats, location) {
  this.id = id;
  this.title = title;
  this.date = date;
  this.category = category;
  this.seats = seats;
  this.location = location;
}
EventConstructor.prototype.checkAvailability = function() {
  return this.seats > 0 && new Date(this.date) > new Date();
};

// Using Object.entries
function logEventDetails(event) {
  for (var _i = 0, _a = Object.entries(event); _i < _a.length; _i++) {
    var _b = _a[_i], key = _b[0], value = _b[1];
    console.log(key + ': ' + value);
  }
}

// ES6 class version (Ex10)
class Event {
  constructor(id, title, date, category, seats, location) {
    this.id = id;
    this.title = title;
    this.date = date;
    this.category = category;
    this.seats = seats;
    this.location = location;
  }
  checkAvailability() {
    return this.seats > 0 && new Date(this.date) > new Date();
  }
}

// ===================================================================
// Exercise 6: Arrays and Methods
// ===================================================================
// .push() — already used in addEvent()
// .filter()
var musicEvents = events.filter(function(e) { return e.category === 'music'; });
console.log('Music events:', musicEvents);
// .map()
var displayCards = events.map(function(e) { return e.title + ' on ' + e.date; });
console.log('Display cards:', displayCards);

// ===================================================================
// Exercise 7: DOM Manipulation
// ===================================================================
// displayEvents() above already uses querySelector, createElement, appendChild
// UI update happens in registerForEvent via displayEvents()

// ===================================================================
// Exercise 8: Event Handling
// ===================================================================
// onclick used on Register buttons above
// onchange for category filter
function filterByCategory(category) {
  var filtered = filterEventsByCategory(category);
  displayEvents(filtered);
  console.log('Filtered by:', category);
}
// keydown for quick search
function quickSearch(event) {
  var query = event.target.value;
  dynamicSearch(query, function(results) {
    displayEvents(results);
  });
}

// ===================================================================
// Exercise 9: Async JS, Promises, Async/Await
// ===================================================================
function fetchEventsWithPromise() {
  var spinner = document.getElementById('loadingSpinner');
  spinner.style.display = 'block';
  fetch('events.json')
    .then(function(response) { return response.json(); })
    .then(function(data) {
      events.length = 0;
      data.forEach(function(e) { events.push(e); });
      displayEvents(events);
      spinner.style.display = 'none';
      console.log('Events fetched via Promise');
    })
    .catch(function(err) {
      spinner.style.display = 'none';
      console.error('Fetch error:', err);
    });
}

async function fetchEventsAsync() {
  var spinner = document.getElementById('loadingSpinner');
  spinner.style.display = 'block';
  try {
    var response = await fetch('events.json');
    var data = await response.json();
    events.length = 0;
    data.forEach(function(e) { events.push(e); });
    displayEvents(events);
  } catch (err) {
    console.error('Fetch error:', err);
  } finally {
    spinner.style.display = 'none';
  }
}

// ===================================================================
// Exercise 10: Modern JavaScript Features (ES6+)
// ===================================================================
// let/const used throughout
// Default parameters
function greetUser(name, greeting) {
  if (greeting === void 0) { greeting = 'Hello'; }
  return greeting + ', ' + name + '!';
}
// Destructuring
function extractEventDetails(_a) {
  var title = _a.title, date = _a.date, location = _a.location;
  return title + ' in ' + location + ' on ' + date;
}
// Spread operator
function filterEventsSafe(category) {
  var cloned = events.slice();
  return cloned.filter(function(e) { return e.category === category; });
}

// ===================================================================
// Exercise 11: Working with Forms
// ===================================================================
function handleFormSubmit(event) {
  event.preventDefault();
  var form = document.getElementById('regForm');
  var name = form.elements['name'].value.trim();
  var email = form.elements['email'].value.trim();
  var selected = form.elements['eventSelect'].value;
  var errors = [];

  if (!name) errors.push('Name is required');
  if (!email.includes('@')) errors.push('Valid email is required');
  if (!selected) errors.push('Select an event');

  var errorDiv = document.getElementById('formErrors');
  if (errors.length > 0) {
    errorDiv.innerHTML = errors.join('<br>');
    return false;
  }
  errorDiv.innerHTML = '';
  document.getElementById('formResult').textContent = 'Registered: ' + name + ' for ' + selected;
  console.log('Form submitted:', { name: name, email: email, event: selected });
  return false;
}

// Populate event select
(function() {
  var select = document.getElementById('regEventSelect');
  events.forEach(function(e) {
    var opt = document.createElement('option');
    opt.value = e.title;
    opt.textContent = e.title;
    select.appendChild(opt);
  });
})();

// ===================================================================
// Exercise 12: AJAX & Fetch API
// ===================================================================
function postRegistration(userData) {
  document.getElementById('formResult').textContent = 'Submitting...';
  setTimeout(function() {
    fetch('https://jsonplaceholder.typicode.com/posts', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(userData)
    })
    .then(function(response) { return response.json(); })
    .then(function(data) {
      document.getElementById('formResult').textContent = 'Registration submitted successfully! ID: ' + data.id;
      console.log('POST response:', data);
    })
    .catch(function() {
      document.getElementById('formResult').textContent = 'Registration failed. Please try again.';
    });
  }, 1500);
}

// Override form submit to use POST
(function() {
  var origSubmit = handleFormSubmit;
  handleFormSubmit = function(event) {
    event.preventDefault();
    var form = document.getElementById('regForm');
    var name = form.elements['name'].value.trim();
    var email = form.elements['email'].value.trim();
    var selected = form.elements['eventSelect'].value;
    postRegistration({ name: name, email: email, event: selected });
    return false;
  };
})();

// ===================================================================
// Exercise 13: Debugging and Testing
// ===================================================================
// Use Chrome DevTools:
// 1. Console tab — view all console.log/warn/error outputs
// 2. Network tab — check events.json and POST to JSONPlaceholder
// 3. Sources tab — add breakpoints in registerForEvent or handleFormSubmit
// 4. Inspect variable values when paused at breakpoints

// ===================================================================
// Exercise 14: jQuery and JS Frameworks
// ===================================================================
$(document).ready(function() {
  $('#registerBtn').click(function() {
    console.log('Register button clicked (jQuery)');
  });

  // Fade in event cards
  $('#eventContainer').fadeIn(800);

  // Fade out filter
  $('#categoryFilter').on('change', function() {
    $('#eventCard').fadeOut(300);
  });
});

// Benefit of frameworks (React/Vue):
// - Component-based architecture for reusable UI
// - Virtual DOM for efficient rendering
// - State management for complex data flow
// - Ecosystem of tools and libraries

// ===================================================================
// Initialize display
// ===================================================================
displayEvents(events);
