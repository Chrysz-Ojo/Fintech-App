package com.chrysz.javaacademybank.service;

import com.chrysz.javaacademybank.dto.*;

public interface UserService {
   BankResponse createAccount(UserRequest userRequest);

   BankResponse balanceEnqiury(EnquiryRequest request );

   String nameEnquiry(EnquiryRequest request);

   BankResponse creditAccount(CreditDebitRequest request);
   BankResponse debitAccount(CreditDebitRequest request);

    BankResponse login(LoginDto loginDto);

    BankResponse transfer(TransferRequest request);
}
