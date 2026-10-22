package com.cyberraksha.service;

import com.cyberraksha.model.EmergencyContact;
import com.cyberraksha.model.QuizQuestion;
import com.cyberraksha.model.ScamLesson;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CyberContentService {
    public List<ScamLesson> lessons() {
        return List.of(
            new ScamLesson("otp-fraud", "OTP and bank impersonation scams", "A caller pretends to be from a bank or service and asks for an OTP, PIN, or password.", "Urgency, threats to block your account, requests for OTP/PIN, or instructions to install an unknown app.", "Never share OTPs, PINs, passwords, or screen access. End the call and contact your bank using its official app or number.", "key-round"),
            new ScamLesson("upi-fraud", "UPI and payment scams", "Fraudsters may send collect requests, fake payment screenshots, or QR codes designed to trick you.", "Someone asks you to enter your UPI PIN to receive money, pressures you to scan a QR code, or relies only on a screenshot as proof of payment.", "You do not need to enter a UPI PIN to receive money. Check the transaction in your own bank/payment app before handing over goods.", "wallet"),
            new ScamLesson("phishing", "Phishing links and fake websites", "A message may imitate a trusted company to steal logins or financial information.", "Unexpected links, misspelled domains, prizes you did not enter, threats, or requests to sign in immediately.", "Do not open suspicious links. Visit the official website by typing its address yourself and report suspicious messages.", "link"),
            new ScamLesson("job-fraud", "Fake job and work-from-home offers", "Scammers promise high income but ask for registration fees, deposits, or sensitive documents.", "Guaranteed high earnings, upfront payment, pressure to act quickly, or interviews only through unusual channels.", "Research the employer independently. Do not pay to secure a job and avoid sharing identity documents before verifying legitimacy.", "briefcase-business"),
            new ScamLesson("digital-arrest", "Threatening calls and fake digital arrest", "A caller may impersonate police or another authority and threaten arrest to demand money.", "Threats, demands for secrecy, video-call intimidation, or instructions to transfer money to prove innocence.", "Do not transfer money because of a threatening call. End the call, speak to a trusted person, and contact official authorities independently.", "shield-alert"),
            new ScamLesson("social-media", "Social media account scams", "Fake profiles or compromised accounts may ask friends for money or send malicious links.", "Unexpected money requests, new accounts claiming to be friends, suspicious links, or login alerts you did not trigger.", "Verify requests using another channel, use unique passwords and multi-factor authentication, and review account recovery settings.", "users")
        );
    }

    public List<QuizQuestion> questions() {
        return List.of(
            new QuizQuestion("A caller says your bank account will be blocked unless you share an OTP. What should you do?", List.of("Share it quickly", "End the call and contact the bank through an official channel", "Send your PIN too"), 1, "Banks and legitimate support staff should not ask you to disclose your OTP or PIN over a call."),
            new QuizQuestion("Someone says you must enter your UPI PIN to receive a refund. Is this safe?", List.of("Yes, all refunds need a PIN", "Only if they sound official", "No. Do not enter a PIN to receive money"), 2, "A UPI PIN authorizes a payment; it is not needed just to receive money."),
            new QuizQuestion("You receive a surprise prize link asking you to log in. What is safest?", List.of("Open it and enter your password", "Avoid the link and check through the official website", "Forward it to friends"), 1, "Unexpected prize links can be phishing. Use independently verified official channels."),
            new QuizQuestion("A caller threatens immediate arrest unless you transfer money. What is a warning sign?", List.of("A demand for urgent payment and secrecy", "A normal public announcement", "A message from a friend you verified"), 0, "Threats and urgent money demands are common scam warning signs. Verify independently."),
            new QuizQuestion("A friend messages from a new account asking for money. What should you do?", List.of("Transfer it immediately", "Verify with your friend through another trusted channel", "Share your bank OTP first"), 1, "Accounts can be impersonated or compromised. Verify money requests independently.")
        );
    }

    public List<EmergencyContact> contacts() {
        return List.of(
            new EmergencyContact("National Cyber Crime Helpline", "1930", "Report suspected financial cyber fraud promptly.", "https://cybercrime.gov.in/"),
            new EmergencyContact("Emergency Response Support System", "112", "For urgent emergencies requiring police, fire, or medical assistance.", "https://112.gov.in/"),
            new EmergencyContact("National Cyber Crime Reporting Portal", "Online", "Official portal for reporting cybercrime and checking reporting guidance.", "https://cybercrime.gov.in/")
        );
    }
}
