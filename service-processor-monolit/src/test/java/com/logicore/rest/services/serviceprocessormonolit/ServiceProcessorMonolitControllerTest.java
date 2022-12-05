package com.logicore.rest.services.serviceprocessormonolit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

import com.logicore.rest.services.serviceprocessormonolit.payment.PaymentMessage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@ExtendWith(MockitoExtension.class)
public class ServiceProcessorMonolitControllerTest {

    @InjectMocks
    ServiceProcessorMonolitController serviceProcessor1Controller;

    @Test
    public void testController() {

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        PaymentMessage paymentMessage = new PaymentMessage();
        paymentMessage.setMessageType("CreditCard");

        ServiceProcessedMonolit serviceProcessed1 = serviceProcessor1Controller.processService(paymentMessage);
        assertThat(serviceProcessed1.getId()).isEqualTo(4);
    }


}
