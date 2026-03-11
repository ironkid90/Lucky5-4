package j$.time.temporal;

import j$.time.h;

public interface m extends TemporalAccessor {
    m b(long j3, r rVar);

    m d(long j3, u uVar);

    m j(h hVar);

    m e(long j3, u uVar) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1, uVar) : d(-j3, uVar);
    }
}
