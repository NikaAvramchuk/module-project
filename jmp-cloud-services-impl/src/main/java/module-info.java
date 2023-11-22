import com.service.Service;
import com.service.impl.ServiceImpl;

module jmp.service.impl {
    requires transitive jmp.service;
    requires jmp.dto;
    requires javafaker;
    provides Service with ServiceImpl;
}
