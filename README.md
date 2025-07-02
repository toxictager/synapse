# 🧠 Synapse

**Synapse** is a cross-platform, privacy-first memory system that helps you quickly capture and sync notes, links, screenshots, and voice memos between your Android device and your Windows computer — **without user accounts or the cloud**.

![Synapse Banner](./banner.png) <!-- Optional image -->

---

## 🚀 MVP Features

| Feature                          | Android App | Windows App |
|----------------------------------|-------------|-------------|
| Save notes and links             | ✅          | ✅ (view)   |
| Save screenshots                 | ✅          | ✅ (view/download) |
| Record voice memos               | ✅          | ✅ (playback) |
| Encrypted syncing                | ✅          | ✅          |
| Offline support                  | ✅          | ✅          |
| Auto-start with system boot      | ❌          | ✅          |

---

## 🔐 Privacy & Security

- No cloud storage
- No user accounts
- No tracking
- End-to-end encryption using a shared secret key
- Local-first design with optional encrypted relay

---

## ⚙️ Architecture Overview

[ Android App ]
|
[ Synced via LAN or Tunnel (e.g. Tailscale) ]
|
[ Windows App Listener ]

pgsql
Copy
Edit

- Encrypted data packets are transmitted over a local network or relay.
- The listener decrypts and stores data locally.
- All operations happen without internet dependency (unless relay is used).

---

## 🛠️ Technologies

- **Frontend (Mobile):** Kotlin / Flutter
- **Frontend (Desktop):** Python (Tkinter) / Flutter Desktop
- **Sync Mechanism:** HTTP / WebSocket (TLS encrypted)
- **Local Storage:** SQLite / Filesystem
- **Encryption:** AES-256-CBC (planned)

---

## 📦 Folder Structure (Planned)

synapse/
├── android/
│ └── (Flutter or native Kotlin app)
├── windows/
│ └── main.py (or Flutter desktop app)
├── shared/
│ └── encryption/
│ └── crypto_utils.py
├── README.md
└── LICENSE

yaml
Copy
Edit

---

## 💡 Why Synapse?

> Because your brain deserves a second brain — that doesn’t sell your memories.

---

## 🛣️ Roadmap

- [x] MVP Planning
- [ ] Implement Android capture system
- [ ] Build encrypted sync protocol
- [ ] Create minimal Windows viewer
- [ ] Polish UI/UX for both platforms
- [ ] Add relay support for remote sync

---

## 👩‍💻 Author

Built with love and caffeine by **Scarlet**

---

## 📜 License

MIT License. Use it, break it, improve it — just don't spy on users.