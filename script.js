// 1. LOGIN FUNCTIONALITY
document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Form reload hone se rokne ke liye
    
    const loginBtn = document.getElementById('loginBtn');
    const loginPage = document.getElementById('loginPage');
    const dashboardPage = document.getElementById('dashboardPage');
    const studentIdInput = document.getElementById('studentId').value;

    // Button par loading effect
    loginBtn.innerText = "Authenticating ID: " + studentIdInput + "...";
    loginBtn.style.opacity = "0.7";
    loginBtn.disabled = true;

    // 1.5 Seconds ka delay (takay real feel aaye)
    setTimeout(() => {
        // Login Page hide karein aur Dashboard show karein
        loginPage.style.display = 'none';
        dashboardPage.style.display = 'flex';
        
        // Console message (Developers ke liye)
        console.log("Portal Access Granted for ID: " + studentIdInput);
    }, 1500);
});

// 2. SIGN UP CLICK FUNCTIONALITY
// Subtitle ke andar maujood 'a' tag (Sign Up link) ko target kar rahe hain
document.querySelector('.subtitle a').addEventListener('click', function(e) {
    e.preventDefault(); // Link ko redirect karne se rokne ke liye
    
    // Alert message dikhayen
    alert("Notice: Online registration for the new semester is currently closed. Please visit the Karachi University Admission Office for manual Sign-Up.");
});

// 3. FORGOT PASSWORD CLICK
document.querySelector('.forgot-link').addEventListener('click', function(e) {
    e.preventDefault();
    alert("Password reset link has been sent to your registered University Email (UoK Mail).");
});