// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.KubernetesAssurancePolicyScopeVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesAssurancePolicyScope {
    private @Nullable String expression;
    private @Nullable List<KubernetesAssurancePolicyScopeVariable> variables;

    private KubernetesAssurancePolicyScope() {}
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    public List<KubernetesAssurancePolicyScopeVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesAssurancePolicyScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private @Nullable List<KubernetesAssurancePolicyScopeVariable> variables;
        public Builder() {}
        public Builder(KubernetesAssurancePolicyScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<KubernetesAssurancePolicyScopeVariable> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(KubernetesAssurancePolicyScopeVariable... variables) {
            return variables(List.of(variables));
        }
        public KubernetesAssurancePolicyScope build() {
            final var o = new KubernetesAssurancePolicyScope();
            o.expression = expression;
            o.variables = variables;
            return o;
        }
    }
}
